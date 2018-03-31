/*
 *  Copyright 2011 MyBatis
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.onlinemall.utils.mybaties;

import org.mybatis.generator.api.FullyQualifiedTable;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.IntrospectedTable.TargetRuntime;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 生成mapper文件的插件
 */
public class RowBoundsPlugin extends PluginAdapter {
    
    private FullyQualifiedJavaType rowBounds;
    private Map<FullyQualifiedTable, List<XmlElement>> elementsToAdd;

    public RowBoundsPlugin() {
        rowBounds = new FullyQualifiedJavaType("com.github.miemiedev.mybatis.paginator.domain.PageBounds");
        elementsToAdd = new HashMap<FullyQualifiedTable, List<XmlElement>>();
    }
    
    public boolean validate(List<String> warnings) {
        return true;
    }
    @Override
    public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method method,
                                                                 Interface interfaze, IntrospectedTable introspectedTable) {
    	super.clientSelectByExampleWithBLOBsMethodGenerated( method,
                 interfaze,  introspectedTable);
		    try{
		    	if (introspectedTable.getTargetRuntime() == TargetRuntime.MYBATIS3) {
		            copyAndAddMethod(method, interfaze);
		        }
		    }catch(Exception e){
				e.printStackTrace();
			}
        return true;
    }

    @Override
    public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(
            Method method, Interface interfaze,
            IntrospectedTable introspectedTable) {
    	super.clientSelectByExampleWithoutBLOBsMethodGenerated( method,  interfaze,
                 introspectedTable);
    	try{
        if (introspectedTable.getTargetRuntime() == TargetRuntime.MYBATIS3) {
            copyAndAddMethod(method, interfaze);
        }
    	}catch(Exception e){
    		e.printStackTrace();
    	}
        return true;
    }


    /**
     * Use the method copy constructor to create a new method, then
     * add the rowBounds parameter.
     * 
//     * @param fullyQualifiedTable
     * @param method
     */
    private void copyAndAddMethod(Method method, Interface interfaze) {
    	Method newMethod = new Method();
        newMethod.setName(method.getName());
        newMethod.setReturnType(method.getReturnType());
        newMethod.setVisibility(method.getVisibility());
        newMethod.setStatic(method.isStatic());
        List<FullyQualifiedJavaType> exceptionList=method.getExceptions();
        if(exceptionList!=null && exceptionList.size()>0){
        	for(FullyQualifiedJavaType pp:exceptionList){
        		newMethod.addException(pp);
        	}
        }
        
        List<String> annotationList=method.getAnnotations();
        if(annotationList!=null && annotationList.size()>0){
        	for(String pp:annotationList){
        		newMethod.addAnnotation(pp);
        	}
        }
        
        List<String> javaDocLinesList=method.getJavaDocLines();
        if(javaDocLinesList!=null && javaDocLinesList.size()>0){
        	for(String pp:javaDocLinesList){
        		newMethod.addJavaDocLine(pp);
        	}
        }
        
        List<Parameter> list=method.getParameters();
        if(list!=null && list.size()>0){
        	for(Parameter pp:list){
        		newMethod.addParameter(pp);
        	}
        }
        newMethod.addParameter(new Parameter(rowBounds, "rowBounds"));
        interfaze.addMethod(newMethod);
        interfaze.addImportedType(rowBounds);
    }
   
}

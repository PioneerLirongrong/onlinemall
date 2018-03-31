package com.onlinemall.utils.mybaties;

import org.mybatis.generator.api.ShellRunner;

import java.io.UnsupportedEncodingException;
import java.net.URL;

/**
 * 自动生成map文件的工具类
 */
public class Main {
        public void generate() throws UnsupportedEncodingException {
            URL urlPath = this.getClass().getClassLoader().getResource("generatorConfig.xml");
            String path = urlPath.toString();
            path = java.net.URLDecoder.decode(path, "UTF-8");
            String filePrefix = "file:";
            path = path.substring(filePrefix.length());
            String[] args = {"-configfile", path, "-overwrite"};
            ShellRunner.main(args);
        }
        public static void main(String[] args) throws UnsupportedEncodingException {
            new Main().generate();
        }


}

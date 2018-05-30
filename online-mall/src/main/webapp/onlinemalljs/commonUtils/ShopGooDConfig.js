var GOOD_TYPE_QUERY_URL = {
    Query: function (name) {
        var result="/shop/listClothes"
        var good1='衣服类别 0:羽绒服 1:毛呢外套 2:棉服 3:毛衣 4:针织衫 5:连衣裙 6:风衣 7:卫衣 8:T恤 9:衬衫 10:打底衫 11:皮衣 12:皮草 13:夹克 14:西装 15:棒球服 16:牛仔外套 17:Polo衫 18:小西装 19:马夹 20:半身裙 21:连衣裙 22:包臀裙 23:A字裙 24:百褶裙 25:休闲裤 26:阔腿裤 27:牛仔裤 28:运动裤 29:小脚裤 30:连体裤 31:背带裤 32:打底裤 33:文胸 34:内裤 35:抹胸 36:背心 37:睡裙 38:睡衣 39:睡裤 40:睡袍 41:安全裤 42:袜子 43:保暖内衣 44:秋衣 45:秋裤 46:丝袜 47:塑身内衣 48:吊带裙';
        var good2='0:白酒 1:啤酒 2:葡萄酒 3:洋酒 4:调制酒 5:暖身黄酒';
        var good3='0:洗发水 1:护发素 2:沐浴露 3:洗衣液 4:洗衣粉 5:香皂 6:肥皂 7:金纺 8:牙膏 9:牙刷 10:毛巾 11:刷子 12:抽纸 13:卷纸 14:盆 15:84消毒液 16:花露水 17:杯子 18:碗 19:排插 20:台灯 21:镜子 22:梳子 23:暖水瓶 24:衣架 25:垃圾桶 26:风扇 27:蚊帐 28:洗洁精 29:鞋架 30:手电筒';
        var good4='0:芒果 1:车厘子 2:苹果 3:橙子 4:猕猴桃 5:柠檬 6:大闸蟹 7:帝王蟹 8:海参 9:金枪鱼 10:鲍鱼 11:红虾 12:牛排 13:猪肉 14:土鸡 15:羊肉 16:山药 17:番薯 18:土豆 19:莲藕 20:鸡蛋 21:鸽子蛋 22:鸭蛋 23:咸鸭蛋 24:皮蛋 25:喜蛋 26:烤鸭酱鸭 27:卤肉 28:凉菜 29:熟鸡 30:鱼类龙利鱼 31:秋刀鱼 32:三文鱼 33:鳕鱼 34:斑鱼 35:比目鱼 36:带鱼 37:金枪鱼';
        var good5='1:橡皮擦 2:中性笔 3:圆珠笔 4:铅笔 5:记号笔 6:可擦笔 7:橡皮 8:小刀 9:卷笔刀 10:文具盒 11:订书机 12:胶水 13:铅笔芯 14:彩笔 15:蜡笔 16:毛笔 17墨水 18钢笔 19:墨汁 20:中性笔芯 21:作业纸 22:信纸 23:稿纸 24:A4纸 25:活页笔记本 26:密码本 27:便利贴 28:改正带';
        var clothesMap={}
        clothesMap[good1]="/shop/listClothes";
        var drinkMap={}
        drinkMap[good2]="/shop/listDrinking";
        var dailyNecessitiesMap={}
        dailyNecessitiesMap[good3]="/shop/listNecessities";
        var freshGood={};
        freshGood[good4]='/shop/listGoodsFreshs';
        var stationerys={};
        stationerys[good5]='/shop/listGoodsStationerys';
        var arr1 = good1.split(" ");
        for(var item in arr1) {
            if(arr1[item].indexOf(name) > -1){
                result =  clothesMap[good1]
                return result;
            }
        }
        var arr2 = good2.split(" ");
        for(var item in arr2) {
            if(arr2[item].indexOf(name) > -1){
                result =  drinkMap[good2]
                return result;
            }
        }
        var arr3 = good3.split(" ");
        for(var item in arr3) {
            if(arr3[item].indexOf(name) > -1){
                result =  dailyNecessitiesMap[good3]
                return result;
            }
        }
        var arr4 = good4.split(" ");
        for(var item in arr4) {
            if(arr4[item].indexOf(name) > -1){
                result =  freshGood[good4]
                return result;
            }
        }
        var arr5 = good5.split(" ");
        for(var item in arr5) {
            if(arr5[item].indexOf(name) > -1){
                result =  stationerys[good5]
                return result;
            }
        }
        return result;
    }
}
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	 <template>
        <div>
            <div class="scan">
                <div id="bcid"></div>
                <footer>
                    <button v-if="Start" @click="startRecognize">扫 码 加 油</button>
                </footer>
            </div>
        </div>
    </template>

    <script>
        // 扫描对象
        var scan = null;
        data(){
            return {
                Begin:true
            }
        },
        methods:{
            startRecognize(){
                const that = this;
                this.Begin = false;
                if(!window.plus) return;
                scan = new plus.barcode.Barcode('bcid');
                // 开始扫描
                scan.start();
                // 扫码成功之后的回调函数 type是类型 result 结果
                scan.onmarked = function(type,result){
                    const text = '';
                    switch(type){
                        case plus.barcode.QR:
                            type = 'QR';
                            break;
                        case plus.barcode.EAN13:
                            type = "EAN13";
                            break;
                        case plus.barcode.EAN8:
                            type = "EAN8";
                            break;
                        default:
                            type = "其它" + type;
                            break;
                    }
                    result = result.replace(/\n/g,"");
                    const id = result.match(/\d+/)[0];
                    const Token = localStorage.getItem('token');
                    that.$router.push({
                        name:'OrderDetail',
                        params: {
                            id:id,
                            token:token
                        }
                    });
                    scan.close();
                }
            },
            // 关闭扫码识别控件 
            closeScan(){
                if(!window.plus) return;
                scan.close();
                this.$router.push('./qrcode');
            }
        }
    </script>

    <style lang="less" scoped>
    .scan {
        height: 96vh;
        background-color: #EFEFEF;

        #bcid {
            width: 100vw;
            height: 96vh;
            text-align: center;
            color: #fff;
        }

        footer {
            width: 100%;
            height: 8rem;
            line-height: 2rem;
            font-size: 14px;
            position: absolute;
            left: 0;
            bottom: 10rem;
            z-index: 999;

            button {
                width: 8rem;
                height: 8rem;
                border: 4px solid #1f4ba5;
                border-radius: 50%;
                font-size: 16px;
                font-family: PingFangSC-Medium;
                background-color: #fff;
            }   
    }
}

    </style>

</body>
</html>
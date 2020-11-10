<template>
    <div class="footer">
        <div class="footer-top">
            <div class="footer-top-left">
                <div style="display: flex; flex-direction: column; margin: 20px 0 5px 15px">
                    <span style="color: #999; font-size: 16px; margin-bottom: 6px">蓝犀互娱</span>
                    <span style="color: #999; font-size: 10px">让每次有趣都更有价值</span>
                    <ul>
                        <li><img src="../../assets/images/footer/weixin.png"></li>
                        <li><img src="../../assets/images/footer/xinxi.png"></li>
                        <li><img src="../../assets/images/footer/douyin.png"></li>
                        <li><img src="../../assets/images/footer/weibo.png"></li>
                    </ul>
                </div>
            </div>
            <div class="footer-top-right" style="display: flex">
                <div style="flex: 1;margin-top: 20px">
                    <div style="color: #949494;font-size: 10px;width: 74px;height: 20px;border-bottom: 1px solid #949494">关于公司</div>
                    <ul style="color: #F6F6F6;font-size: 10px">
                        <li>关于蓝犀互娱</li>
                        <li>我们的团队</li>
                        <li>联系我们</li>
                    </ul>
                </div>
                <div style="flex: 1;margin-top: 20px">
                    <div style="color: #949494;font-size: 10px;width: 74px;height: 20px;border-bottom: 1px solid #949494">友情链接</div>
                    <ul style="color: #F6F6F6;font-size: 10px">
                        <li>九州行官网</li>
                        <li>大吕网络</li>
                        <li>抖音短视频</li>
                        <li>今日头条</li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="footer-bottom">
            <div>Copyright © 2016-2020 Nola Network Websoft.All Rights Reserved</div>
            <div>
                <img src="../../assets/images/footer/shangb.png"style="width: 12px; height: 12px;vertical-align:bottom;">
                <span style="width: 100px; height: 8px; font-size: 8px;line-height: 12px;color: #949494;margin: 0 9px">闽网文〔2017〕6960-136号</span>
                <img src="../../assets/images/footer/xukez.png" style="width: 9px;height: 12px;vertical-align:bottom;">
                <span style="width: 128px; height: 8px;font-size: 8px;line-height: 12px;color: #949494;margin: 0 9px">电信增值业务许可证闽B2-20180237</span>
            </div>
            <div>备案/许可证号闽ICP备17001152号-2</div>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'CommonFooter',
    }
</script>

<style lang="scss" scoped>
    .footer{
        width: 100%;
        height: 100%;
        display: flex;
        background-color: #575757;
        flex-direction: column;
        .footer-top{
            width: 100%;
            height: 111px;
            display: flex;
            .footer-top-left{
                flex: 1;
                ul{
                    margin-top: 12px;
                }
                ul>li{
                    float: left;
                    width: 20px;
                    height: 20px;
                    margin-right: 5px;
                }
            }
            .footer-top-right{
                flex: 1;
                ul>li{
                    margin-top: 8px;
                    height: 10px;
                }
            }
        }
        .footer-bottom{
            width: 100%;
            height: 65px;
            padding-left: 24px;
            padding-top:14px;
            :nth-child(1){
                width: 244px;
                height: 9px;
                font-size: 8px;
                line-height: 11px;
                color: #949494;
            }
            :nth-child(3){
                width:131px;
                height: 9px;
                font-size: 8px;
                line-height: 12px;
                color: #949494;
            }
        }
    }
</style>

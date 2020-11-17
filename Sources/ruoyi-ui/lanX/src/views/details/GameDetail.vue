<template>
    <div class="game-details">
        <div class="header-warp"><common-header></common-header></div>
        <div class="content-warp">
            <div class="label">
                <img src="~assets/images/details/gtx.png">
                <div>
                    <div style="width: 28px; height: 14px; font-size: 14px; color: #333; margin: 17px 0 3px 0">Name</div>
                    <div style="width: 61px; height: 10px; font-size: 10px; color: #25acf1; margin-bottom: 10px">厂商：gsdsg</div>
                    <div>
                        <span class="download" style="background-color: #25acf1;">下载</span>
                        <span class="download" style="background-color: #bfbfbf; margin: 0 10px">下载</span>
                        <span style="width: 74px; height: 20px; background: #25acf1; border-radius: 4px;">扫码开玩</span>
                    </div>
                </div>
            </div>
            <div class="game">
                <div class="introduce">
                    <div style="height: 12px; border-left: 2px solid #25acf1; color: #333; font-size: 12px; margin-left: 17px; padding-left: 6px">游戏介绍</div>
                    <div class="text">
                        <p>在七种元素交汇的大陆——「提瓦特」，每个人都可以成为神。</p>
                        <p>你从世界之外漂流而来，降临大地。在这广阔的世界中，你自由旅行、结识同伴、寻找掌控尘世元素的七神，直到与分离的血亲重聚，在终点见证一切旅途的沉淀。</p>
                        <p>维系者正在死去，创造者尚未到来。面对无法掌控的境遇，人类总会喟叹自身的无力…… 但在人生最陡峭的转折处，若有凡人的渴望达到极致，神明的视线就将投射而下。</p>
                        <p>当失散的双子在尘沙中重聚、世界的谜底在「神之眼」中尽数显现之时<br>—— <br>旅行者，你将去往何方？ </p>
                    </div>
                </div>
                <div class="teach-video">
                    <div style="height: 12px; border-left: 2px solid #25acf1; color: #333; font-size: 12px; margin-left: 17px; padding-left: 6px">视频</div>
                    <div class="video">
                        <img src="~assets/images/details/st1.png" style="margin-right: 4px">
                        <img src="~assets/images/details/st2.png">
                        <div>
                            <p>《原神·提瓦特篇》主线章节预告PV-「足迹」</p>
                            <p>5小时前</p>
                        </div>
                        <div style="left: 163px">
                            <p>《原神·提瓦特篇》主线章节预告PV-「足迹」</p>
                            <p>5小时前</p>
                        </div>
                    </div>
                </div>
                <div class="detail">
                    <div style="height: 12px; border-left: 2px solid #25acf1; color: #333; font-size: 12px; margin-left: 17px; padding-left: 6px">详细信息</div>
                    <div class="message1">
                        <span>文件大小:</span>
                        <span>当前版本:</span>
                        <span>更新时间:</span>
                    </div>
                    <div class="message2">
                        <span>136.40MB</span>
                        <span>1.0.0_1112729_1135452</span>
                        <span>2020年09月23日</span>
                    </div>
                    <div style="width: 20px; height: 10px; font-size: 10px; color: #333; margin: 0 0 6px 17px">厂商</div>
                    <div style="width: 36px; height: 10px; font-size: 10px; color: #666; margin-left: 17px">miHoYo</div>
                </div>
            </div>
        </div>
        <div class="footer-warp"><common-footer></common-footer></div>
    </div>
</template>

<script>
    import CommonHeader from 'components/common/CommonHeader.vue'
    import CommonFooter from 'components/common/CommonFooter.vue'

    export default {
        name: 'GameDetail',
        components:{
            CommonHeader,
            CommonFooter
        }
    }
</script>

<style lang="scss" scoped>
    *{
        margin: 0;
        padding: 0;
    }
    .game-details{
        display: flex;
        flex-direction: column;
        min-height: 100vh;
    }
    .header-warp{
        width: 100%;
        height: 52px;
    }
    .content-warp{
        width: 100%;
        flex: 1;
        border:15px solid #f2f2f2;
        border-top: 10px solid #f2f2f2;
        border-bottom: 16px solid #f2f2f2;
        background-color: #f2f2f2;
        .label{
            width: 100%;
            height: 98px;
            background: #fff;
            border-radius: 4px;
            box-shadow: 0 2px 2px 0 rgba(0,0,0,0.05);
            margin-bottom: 12px;
            display: flex;
            img{
                width: 60px;
                height: 60px;
                margin: 17px 13px 0 19px;
            }
            span{
                display: inline-block;
                color: #fff;
                font-size: 10px;
                line-height: 20px;
                text-align: center;
            }
            .download{
                width: 60px;
                height: 20px;
                border-radius: 4px;
            }
        }
        .game{
            width: 100%;
            height: 501px;
            background: #fff;
            border-radius: 4px;
            box-shadow: 0 2px 2px 0 rgba(0,0,0,0.05);
            .introduce{
                width: 100%;
                height: 230px;
                padding-top: 15px;
                .text{
                    width: 317px;
                    height: 176px;
                    font-size: 10px;
                    text-align: left;
                    color: #333;
                    line-height: 12px;
                    margin-left: 17px;
                    p{
                        margin-top: 12px;
                        margin-bottom: 16px;
                    }
                }
            }
            .teach-video{
                width: 100%;
                height: 146px;
                border-top: 1px solid #f2f2f2;;
                border-bottom: 1px solid #f2f2f2;
                padding-top: 15px;
                .video{
                    display: flex;
                    width: 317px;
                    margin-left: 17px;
                    margin-top: 9px;
                    position: relative;
                    img{
                        overflow: hidden;
                    }
                    div{
                        position: absolute;
                        bottom: 10px;
                        p{
                            width: 156px;
                            height: 10px;
                            font-size: 10px;
                            color: #fff;
                            line-height: 26px;
                        }
                    }
                }
            }
            .detail{
                padding-top: 15px;
                .message1{
                    margin: 12px 0 6px 17px;
                    span{
                        display: inline-block;
                        width: 43px;
                        height: 10px;
                        font-size: 10px;
                        color: #333;
                    }
                    span:nth-child(2){
                        margin: 0 96px 0 42px;
                    }
                }
                .message2{
                    margin: 0 0 10px 17px;
                    span{
                        font-size: 10px;
                        color: #666;
                        display: inline-block;
                        width: 45px;
                        height: 10px;
                    }
                    span:nth-child(2){
                        width: 110px;
                        height: 11px;
                        margin: 0 29px 0 40px;
                    }
                    span:nth-child(3){
                        width: 76px;
                        height: 10px;
                    }
                }
            }
        }
    }
    .footer-warp{
        width: 100%;
        height: 176px;
    }
</style>

<template>
    <div class="more">
        <div class="header-warp"><common-header></common-header></div>
        <div class="content-warp">
            <div style="width: 100%; height: 830px; background-color: #fff; border-radius: 4px">
                <div class="title">
                    <div>巨芯互娱荣获抖音任务台发行人机构榜一</div>
                    <div>
                        <span style="margin: 0 195px 0 13px">来自 蓝犀互娱</span>
                        <span>2020/10/22</span>
                    </div>
                </div>
                <div>
                    <div style="width: 318px; height: 67px; font-size: 12px; text-align: left; color: #333333; line-height: 18px; margin: 20px 14px 12px 13px">
                        《抖音游戏发行人活跃MCN机构榜》是根据机构的总收益、投稿的达人数量、机构总体的粉丝量级、机构的总投稿量、投稿的任务款数等多个维度来综合评选，
                        是抖音对于游戏达人推广机构出台的一个专业性榜单。
                    </div>
                    <ul class="describe">
                        <li><img src="~assets/images/news/more1.png" alt=""></li>
                        <li><img src="~assets/images/news/more2.png" alt=""></li>
                    </ul>
                    <div style="width: 319px; height: 51px; font-size: 12px; font-weight: 400; text-align: left; color: #333333; line-height: 18px; margin: 18px 13px 0">
                        巨芯互娱在该榜单首次出台的时候就成功登榜，并取得第二的好成绩。在后续的榜单中，巨芯互娱力压上榜首，成功摘得桂冠。
                    </div>
                </div>
            </div>
            <div style="width: 100%; height: 44px; border-bottom: 1px solid #ddd; padding: 16px 0 10px 0; font-size: 18px; color: #333">相关新闻</div>
            <ul class="notice">
                <li v-for="item in moreL">
                    <div>
                        <div style="width: 178px; height: 39px; font-size: 14px; color: #333; line-height: 20px; margin: 24px 21px 8px 19px">【公告】&nbsp;{{item.moreCore}}区|{{item.moreTitle}}</div>
                        <div style="width: 26px; height: 10px; font-size: 10px; color: #999; line-height: 22px; margin: 0 0 12px 19px">{{item.moreDate}}</div>
                    </div>
                    <img src="~assets/images/news/tou.png" style="margin: 17px 19px 10px 0;">
                </li>
            </ul>
        </div>
        <div class="footer-warp"><common-footer></common-footer></div>
    </div>
</template>

<script>
    import CommonHeader from 'components/common/CommonHeader.vue'
    import CommonFooter from 'components/common/CommonFooter.vue'
    export default {
        name: 'More',
        data(){
          return{
              moreL:[]
          }
        },
        components: {
            CommonHeader,
            CommonFooter,
        },
        mounted(){
            this.http.get('/news/getData').then(
                res=>{
                    res = res.data;
                    this.moreL = res.moreDate
                }
            )
        }
    }
</script>

<style lang="scss" scoped>
    *{
        margin: 0;
        padding: 0;
    }
    .more{
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
        .title{
           width: 100%;
           height: 54px;
           border-bottom: 1px solid #f2f2f2;
            padding-top: 11px;
           div:first-child{
               width: 252px;
               height: 14px;
               font-size: 14px;
               margin: 0 0 6px 13px;
               text-align: left;
               color: #333;
           }
           div:last-child{
               font-size: 10px;
               font-weight: 400;
               text-align: left;
               color: #999;
           }
        }

        .notice{
            width: 100%;
            background: #fff;
            border-radius: 4px;
            margin-top: 9px;
            box-shadow: 0 2px 2px 0 rgba(0,0,0,0.05);
            li{
                display: flex;
                border-bottom: 1px solid #f2f2f2;
            }
            li:last-child{
                border: none;
            }
        }
    }
    .footer-warp{
        width: 100%;
        height: 176px;
    }
</style>

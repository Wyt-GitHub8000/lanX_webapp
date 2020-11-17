<template>
    <div class="player-details">
        <div class="header-warp"><common-header></common-header></div>
        <div class="content-warp">
            <div class="player-message">
                <img src="~assets/images/details/label.png" alt="" class="er-code">
                <img src="~assets/images/details/pt.png" alt="">
                <div class="corner"></div>
                <div class="name">{{currentPlayer.playerName}}</div>
                <div class="other">
                    <span>综合得分：{{currentPlayer.playerClass}}★</span>
                    <span>主播领域：{{currentPlayer.playerField}}</span>
                    <span>抖音号：{{currentPlayer.playerId}}</span>
                </div>
                <div class="count">
                    <span>
                        <div style="width: 54px; height: 16px; font-size: 16px; color: #25acf1; line-height: 21px;  margin: 0 0 8px 77px">{{currentPlayer.playerFans}}</div>
                        <div style="width: 24px; height: 12px; font-size: 12px; color: #25acf1; line-height: 21px; margin-left: 92px">粉丝</div>
                    </span>
                    <span>
                        <div style="width: 36px; height: 16px; font-size: 16px; color: #25acf1; line-height: 21px; margin: 0 0 8px 45px">{{currentPlayer.playerWorks}}</div>
                        <div style="width: 24px; height: 12px; font-size: 12px; color: #25acf1; line-height: 21px; margin-left: 50px;">视频</div>
                    </span>
                </div>
            </div>
            <div class="player-worker">
                <div style="height: 37px; border-bottom: 1px solid #ddd; position: relative">
                    <div class="works">视频&nbsp;{{currentPlayer.playerWorks}}</div>
                </div>
                <div style="width: 72px; height: 12px; font-size: 12px; color: #333; line-height: 21px; margin: 11px 0 12px 18px">全部视频稿件</div>
                <player></player>
            </div>
            <div class="pagination ">
                <van-pagination v-model="currentPage" :total-items="125" :page-count="50"
                                :show-page-size="currentPage>=5 && currentPage<=47 ? 6 :7"  force-ellipses >
                    <template #prev-text>
                        <van-icon name="arrow-left" />
                    </template>
                    <template #next-text>
                        <van-icon name="arrow" />
                    </template>
                    <template #page="{ text }">{{ text }}</template>
                </van-pagination>
            </div>
        </div>
        <div class="footer-warp"><common-footer></common-footer></div>
    </div>
</template>

<script>
    import CommonHeader from 'components/common/CommonHeader.vue'
    import CommonFooter from 'components/common/CommonFooter.vue'
    import Player from 'components/content/details/Player.vue'

    import { mapState } from 'vuex'
    export default {
        name: 'PlayerDetails',
        data(){
          return{
              currentPage:1
          }
        },
        components:{
            CommonHeader,
            CommonFooter,
            Player
        },
        computed:{
            ...mapState({
                currentPlayer : state => state.playerMessage.currentPlayerMessage
            })
        }
    }
</script>

<style lang="scss" scoped>
    *{
        margin: 0;
        padding: 0;
    }
    .player-details{
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
        display: flex;
        flex-direction: column;
        .player-message{
            width: 100%;
            height: 242px;
            background: #fff;
            border-radius: 4px;
            box-shadow: 0 2px 2px 0 rgba(0,0,0,0.05);
            position: relative;
            img{
                border-radius: 50%;
                margin: 21px 0 16px 136px;
            }
            .er-code{
                border-radius: 0;
                position: absolute;
                margin: 0;
                left: 7px;
                top: 3px;
            }
            .corner{
                width: 97px;
                height: 73px;
                background-color: #fff;
                position: absolute;
                transform: rotate(45deg);
                left: 17px;
                top: 26px;
            }
            .name{
                width: 90px;
                height: 18px;
                font-size: 18px;
                color: $font2-color;
                text-align: center;
                margin: 0 0 11px 131px;
            }
            .other{
                margin-left: 27px;
                span{
                    display: inline-block;
                    width: 76px;
                    height: 10px;
                    font-size: 10px;
                    color: #999;
                    line-height: 11px;
                }
                span:nth-child(2){
                    width: 120px;
                    margin: 0 -5px 0 25px;
                }
                span:nth-child(3){
                    width: 78px;
                }
            }
            .count{
                display: flex;
                margin-top: 16px;
                span{
                   height: 48px;
                    flex: 1;
                }
                span:nth-child(2){
                    border-left: 1px solid #ddd;
                }
            }
        }
        .player-worker{
            flex: 1;
            width: 100%;
            background: #fff;
            border-radius: 4px 4px 0  0 ;
            box-shadow: 0  2px 2px 0 rgba(0,0,0,0.05);
            margin-top: 13px;
            .works{
                width: 56px;
                height: 22px;
                font-size: 12px;
                color: #25acf1;
                line-height: 21px;
                border-bottom: 3px solid #25acf1;
                margin-left: 18px;
                position: absolute;
                bottom: 0;
            }
        }
        .pagination{
            width: 345px;
            height: 54px;
            background: #fafafa;
            border-top: 1px solid #ddd;
            margin-bottom: 5px;
            padding-top: 14px;
        }
    }
    .footer-warp{
        width: 100%;
        height: 176px;
    }
</style>
<style lang="scss">
    //自定义vant按钮组件样式
    .van-pagination{
        display: block;
        margin-left: 10px;
        li{
            width: 28px;
            height: 28px;
            float: left;
            border: 1px solid #cbcbcb;
            min-width:28px;
            border-radius: 4px;
            font-size: 10px;
            box-shadow: 0 2px 2px 0 rgba(0, 0, 0, 0.05);
            margin: 0 2px;
            line-height: 28px;
        }
    }
</style>
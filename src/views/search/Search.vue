<template>
    <div class="search">
        <div class="header-warp"><common-header></common-header></div>
        <div class="content-warp">
            <ul class="tab">
                <li class="current1">视频5</li>
                <li>游戏1</li>
                <li>厂商1</li>
            </ul>
            <ul class="content1">
                <li class="show1">
                    <viedos></viedos>
                </li>
                <li>
                    <div class="game1">
                        <img src="~assets/images/search/yx.png">
                        <div>
                            <div style="width: 28px; height: 14px; font-size: 14px; color: #333; margin: 20px 0 5px 0">原神</div>
                            <div style="width: 36px; height: 10px; font-size: 10px; color: #999;">miHoYo</div>
                            <div class="flag">
                                <span>开放世界</span>
                                <span>角色扮演</span>
                                <span>二次元</span>
                            </div>
                        </div>
                    </div>
                    <div>
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
                </li>
                <li>
                    <div class="game1">
                        <img src="~assets/images/search/firm.png">
                        <div>
                            <div>
                                <span style="width: 51px; height: 14px; font-size: 14px; color: #333; margin: 17px 9px 6px 0">miHoYo</span>
                                <span style="width: 38px; height: 10px; font-size: 10px; color: #999;">8款游戏</span>
                            </div>
                            <div style="width: 244px; height: 39px; font-size: 10px; color: #333; line-height: 14px;">米哈游主要由三位热爱技术、游戏、漫画等文化的上海交通大学学生创立。公司成立于2012年，业务主要集中在国创移动游戏、漫画等领域。</div>
                        </div>
                    </div>
                    <div>
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
                </li>
            </ul>
        </div>
        <div class="footer-warp"><common-footer></common-footer></div>
    </div>
</template>

<script>
    import CommonHeader from 'components/common/CommonHeader.vue'
    import CommonFooter from 'components/common/CommonFooter.vue'

    import Viedos from 'components/content/search/Viedos.vue'

    export default {
        name: 'Search',
        data(){
            return{
                currentPage:1
            }
        },
        components:{
            CommonHeader,
            CommonFooter,
            Viedos
        },
        mounted(){
            $('.tab>li').click(function () {
                $(this).addClass('current1');
                $(this).siblings('.current1').removeClass('current1')
                $('.content1>li').eq($(this).index()).addClass('show1')
                $('.content1>li').eq($(this).index()).siblings('.show1').removeClass('show1')
            })
        }
    }
</script>

<style lang="scss" scoped>
    *{
        margin: 0;
        padding: 0;
    }
    .search{
        display: flex;
        flex-direction: column;
        min-height: 100vh;
    }
    .header-warp{
        width: 100%;
        height: 45px;
    }
    .content-warp{
        width: 100%;
        flex: 1;
        border:15px solid #f2f2f2;
        border-top: 10px solid #f2f2f2;
        border-bottom: 16px solid #f2f2f2;
        background-color: #f2f2f2;
        .tab{
            border-bottom: 1px solid #ddd;
            display: flex;
            box-sizing: content-box;
            padding-left: 15px;
            li{
                height: 35px;
                width: 34px;
                font-size: 12px;
                color: #999999;
                line-height: 38px;
                text-align: center;
                position: relative;
            }
            li:nth-child(2){
                margin: 0 30px;
            }
            .current1{
                bottom: -1px;
                border-bottom: 3px solid #25acf1;
                color: #25acf1;
            }
        }
        .content1{
            margin-top: 19px;
            li{
                display: none;
                .game1{
                    width: 100%;
                    height: 96px;
                    background: #fff;
                    border-radius: 4px;
                    box-shadow: 0 2px 2px 0 rgba(0,0,0,0.05);
                    display: flex;
                    flex-wrap: wrap;
                    margin-bottom: 255px;
                    img{
                        width: 60px;
                        height: 60px;
                        margin: 16px 13px 0 20px;
                    }
                    span{
                        display: inline-block;
                    }
                    .flag{
                        margin-top: 9px;
                        span{
                            width: 50px;
                            height: 18px;
                            background: #f6f6f6;
                            border: 1px solid #f6f6f6;
                            border-radius: 4px;
                            font-size: 8px;
                            color: #707070;
                            line-height: 18px;
                            text-align: center;
                        }
                        span:nth-child(2){
                            margin: 0 8px;
                        }
                    }
                }
            }
            .show1{
                display: block;
            }
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
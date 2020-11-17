<template>
    <div>
        <!--首页轮播图，不完美需要修改-->
        <!--<van-swipe class="my-swipe" :autoplay="3000" indicator-color="white">-->
            <!--<van-swipe-item @click="itemClick"><img src="~assets/images/home/swiper1.jpg"></van-swipe-item>-->
            <!--<van-swipe-item @click="itemClick"><img src="~assets/images/home/swiper2.jpg"></van-swipe-item>-->
            <!--<van-swipe-item @click="itemClick"><img src="~assets/images/home/yuanshen.jpg"></van-swipe-item>-->
            <!--<van-swipe-item @click="itemClick"><img src="~assets/images/home/swiper1.jpg" ></van-swipe-item>-->
            <!--&lt;!&ndash;Vue3.0插槽的形式，调用者传入自定义的指示器类型&ndash;&gt;-->
            <!--<template #indicator>-->
                <!--<ul class="custom-indicator">-->
                    <!--如果有轮播图需求将下面的div.ad代码放在li中进行轮播-->
                <!--</ul>-->
            <!--</template>-->
        <!--</van-swipe>-->
        <div class="ad">
            <img src="~assets/images/home/swiper2.jpg" alt="" @click="itemClick">
            <div class="bgc">
                <div class="shade1">
                    <img src="~assets/images/home/bgc1.png" alt="">
                    <div>
                        <div style="width: 70px; height: 14px; font-size: 14px; color: #fff; margin: 19px 0 7px 0">未定事件簿</div>
                        <div style="width: 67px; height: 12px; font-size: 12px; color: #fff;">推理·女性向</div>
                    </div>
                </div>
                <div class="shade2">
                    <img src="~assets/images/home/bgc2.png" alt="" style="margin-left: 26px; margin-right: 15px">
                    <img src="~assets/images/home/bgc2.png" alt="">
                </div>
            </div>
        </div>
        <!--首页游戏推荐，进行了简单的组件封装-->
        <game-recommand :item="gameData"></game-recommand>
        <!--首页玩家排行榜，进行了简单的组件封装-->
        <player-rank :item="playerData"></player-rank>

        <game-recommand :item="gameData"></game-recommand>

        <div>
            <div class="videos">
                <span>热门视频排行榜</span>
                <a href="">更多</a>
            </div>
            <div style="margin-top: 9px">
                <ul class="videoslist">
                    <li style="display: flex; align-items: center" v-for="(item,index) in playerData" >
                        <span style="font-size: 12px; color: #FE931B; margin:0 13px">{{index+1}}</span>
                        <img src="~assets/images/home/tou.png" style="width: 40px; height: 40px; border-radius: 50%">
                        <div style="display: flex; flex-direction: column; margin-left: 8px">
                            <span style="font-size: 12px; color: #333; margin: 18px 0 6px">{{item.playerName}}</span>
                            <span style="font-size: 10px; color: #9D9D9D">{{item.playerCore}}</span>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <game-recommand :item="gameData"></game-recommand>

        <more-button></more-button>
    </div>
</template>

<script>
    import MoreButton from 'components/content/home/MoreButton.vue'
    import GameRecommand from 'components/content/home/GameRecommand.vue'
    import PlayerRank from 'components/content/home/PlayerRank.vue'

    export default {
        name: 'Home',
        components:{
            GameRecommand,
            PlayerRank,
            MoreButton
        },
        mounted(){
            this.http.get('/home/getData').then(
                res =>{
                    res= res.data;
                   this.gameData = res.data;
                   this.playerData = res.data1
            })
        },
        data(){
            return{
                gameData:[],
                playerData:[],
                index:1,
                current:1
            }
        },
        methods:{
            itemClick(){
                this.$router.push('/gamedetails')
            }
        }
    }
</script>

<style lang="scss" scoped>
    /*.my-swipe .van-swipe-item {*/
        /*img{*/
            /*width: 100%;*/
            /*height: 415px;*/
            /*border-radius: 8px;*/
        /*}*/
    /*}*/
    .ad{
        position: relative;
        img{
            width: 100%;
            height: 415px;
            border-radius: 8px;
        }
        .bgc{
            position: absolute;
            width: 100%;
            display: flex;
            bottom: 4px;
           .shade1{
                width: 180px;
                height: 70px;
                background: rgba(0,0,0,.5);
                border-radius: 0 0 0 8px;
                display: flex;
               img{
                   width: 50px;
                   height: 50px;
                   margin: 10px 7px 10px 18px;
               }
            }
           .shade2{
                width: 165px;
                height: 70px;
                background: rgba(0,0,0,.2);
                border-radius: 0 0 8px 0;
               img{
                   width: 50px;
                   height: 50px;
                   margin-top: 10px;
               }
            }
        }
    }
    .videos{
        width: 100%;
        margin-top: 16px;
        border-bottom: 1px solid #ddd;
        height: 30px;
        span{
            float: left;
            font-size: 18px;
            line-height: 27px;
        }
        a{
            float: right;
            color: #2faff1;
            font-size: 14px;
           line-height: 27px;
        }
    }
    .videoslist{
        width: 100%;
        display: flex;
        flex-wrap: wrap;
        li{
            width: 170px;
            height: 66px;
            display: block;
            border-radius: 4px;
            box-shadow: 0 2px 2px 0 rgba(0,0,0,0.05);
            background-color: #fff;
            margin-top: 0;
            margin-bottom: 10px;
            position: relative;
        }
        li:nth-child(odd){
            margin-right: 5px;
        }
    }
</style>
<style lang="scss">
    .van-grid-item__content{
        padding: 0;
    }
</style>

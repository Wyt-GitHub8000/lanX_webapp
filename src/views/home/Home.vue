<template>
    <div>
        <!--首页轮播图，不完美需要修改-->
        <van-swipe class="my-swipe" :autoplay="3000" indicator-color="white">
            <van-swipe-item><img src="../../assets/images/swiper1.jpg" alt=""></van-swipe-item>
            <van-swipe-item><img src="../../assets/images/swiper2.jpg" alt=""></van-swipe-item>
            <van-swipe-item><img src="../../assets/images/yuanshen.jpg" alt=""></van-swipe-item>
            <van-swipe-item><img src="../../assets/images/swiper1.jpg" alt=""></van-swipe-item>
        </van-swipe>
        <!--首页游戏推荐，进行了简单的组件封装-->
        <game-recommand :item="gameData"></game-recommand>
        <!--首页玩家推荐，进行了简单的组件封装-->
        <player-rank :item="playerData"></player-rank>

        <game-recommand :item="gameData"></game-recommand>

        <div>
            <div class="videos">
                <span>热门视频排行榜</span>
                <a href="">更多</a>
            </div>
            <div style="margin-top: 9px">
                <ul class="videoslist clearfix">
                    <li style="display: flex; align-items: center" v-for="(item,index) in playerData" >
                        <span style="font-size: 12px; color: #FE931B; margin:0 13px">{{index+1}}</span>
                        <img src="../../assets/images/home/tou.png" style="width: 40px; height: 40px; border-radius: 50%">
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
    import MoreButton from '../../components/content/home/MoreButton.vue'
    import GameRecommand from '../../components/content/home/GameRecommand.vue'
    import PlayerRank from '../../components/content/home/PlayerRank.vue'

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
                    console.log(res);
                   this.gameData = res.data;
                   this.playerData = res.data1
            })
        },
        data(){
            return{
                gameData:[],
                playerData:[],
                index:1
            }
        }
    }
</script>

<style lang="scss" scoped>
    .my-swipe .van-swipe-item {
        img{
            width: 100%;
            height: 415px;
            border-radius: 8px;
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
        width: 351px;
        li{
            width: 170px;
            height: 66px;
            display: block;
            float: left;
            border-radius: 4px;
            box-shadow: 0px 2px 2px 0px rgba(0,0,0,0.05);
            background-color: #fff;
            margin-top: 0;
            margin-bottom: 10px;
            position: relative;
        }
        li:nth-child(odd){
            margin-right: 5px;
        }
    }
    .clearfix:after{
        content:".";
        display:block;
        height:0;
        clear:both;
        visibility:hidden;
    }
</style>
<style lang="scss">
    .van-grid-item__content{
        padding: 0;
    }
</style>

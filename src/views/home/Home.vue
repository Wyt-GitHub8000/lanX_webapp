<template>
    <div>
        <van-swipe class="my-swipe" :autoplay="3000" indicator-color="white">
            <van-swipe-item @click="itemClick"><img src="~assets/images/home/swiper1.jpg"></van-swipe-item>
            <van-swipe-item @click="itemClick"><img src="~assets/images/home/swiper2.jpg"></van-swipe-item>
            <van-swipe-item @click="itemClick"><img src="~assets/images/home/yuanshen.jpg"></van-swipe-item>
            <van-swipe-item @click="itemClick"><img src="~assets/images/home/swiper1.jpg" ></van-swipe-item>
            <!--Vue3.0插槽的形式，调用者传入自定义的指示器类型-->
            <template #indicator>
                <ul class="custom-indicator">
                    <li>
                        <div class="ad">
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
                    </li>
                </ul>
            </template>
        </van-swipe>

        <!--首页游戏推荐，进行了简单的组件封装-->
        <game-recommand :item="gameData1"></game-recommand>

        <!--首页玩家排行榜，进行了简单的组件封装-->
        <player-rank :item="playerData"></player-rank>

        <game-recommand :item="gameData2"></game-recommand>

        <div>
            <div class="videos">
                <span>热门视频排行榜</span>
                <a href="">更多</a>
            </div>
            <video-recommand :item="videoData"></video-recommand>
        </div>

        <game-recommand :item="gameData3"></game-recommand>

        <!--本来想利用父组件向子组件传递gameData数据，当子组件中按钮点击时修改gameData的值，但是vue不推荐在子组件中修改父组件传过来的值-->
        <more-button v-on:more-btn="moreClick" :flag="flag"></more-button>
    </div>
</template>

<script>
    import MoreButton from 'components/content/home/MoreButton.vue'
    import GameRecommand from 'components/content/home/GameRecommand.vue'
    import PlayerRank from 'components/content/home/PlayerRank.vue'
    import VideoRecommand from 'components/content/home/VideoRecommand.vue'

    export default {
        name: 'Home',
        components:{
            GameRecommand,
            PlayerRank,
            MoreButton,
            VideoRecommand
        },
        data(){
            return{
                gameData1:[],
                gameData2:[],
                gameData3:[],
                playerData:[],
                videoData:[],
                index:5,
                current:1,
                flag:false
            }
        },
        methods:{
            itemClick(){
                this.$router.push('/gamedetails')
            },
            moreClick(){
                this.flag =true;
                const params = new URLSearchParams();
                params.append('page','6');
                params.append('pageSize','8');
                this.http.post('http://localhost:80/home/games',params).then(
                    res =>{
                        res= res.data;
                        this.gameData3 = res.data;
                        this.flag =false
                        console.log(this.gameData3)
                    })
            },
            //调用后端人员提供的接口数据，非mock方式。当一个页面要发出多个数据请求时，通常使用axios并发请求
            getGame1(){
                const params = new URLSearchParams();
                params.append('page','1');
                params.append('pageSize','3');
                return this.http.post('http://localhost:80/home/games',params);
            },
            getGame2(){
                const params = new URLSearchParams();
                params.append('page','3');
                params.append('pageSize','2')
                return this.http.post('http://localhost:80/home/games',params);
            },
            getGame3(){
                const params = new URLSearchParams();
                params.append('page','5');
                params.append('pageSize','2');
                return this.http.post('http://localhost:80/home/games',params);
            },

            getPlayer(){
                const params = new URLSearchParams();
                params.append('page','1');
                params.append('pageSize','6');
                return this.http.post('http://localhost:80/home/kols',params);
            },
            getVideo(){
                const params = new URLSearchParams();
                params.append('page','1');
                params.append('pageSize','6');
                return this.http.post('http://localhost:80/home/awemes',params);
            }
        },
        mounted(){
            //在mounted的钩子函数中发送并发请求，注意axios.all的报错问题，解决办法详见我的CSDN博客
            let _this = this;
            this.http.all([_this.getGame1(),_this.getGame2(),_this.getGame3(),_this.getPlayer(),_this.getVideo()]).then(
                this.http.spread(function (res1,res2,res3,res4,res5) {
                    console.log('成功请求首页所有数据')
                    res1 = res1.data;
                    res2 = res2.data;
                    res3 = res3.data;
                    res4 = res4.data;
                    res5 = res5.data;
                    _this.gameData1 = res1.data;
                    _this.gameData2 = res2.data;
                    _this.gameData3 = res3.data;
                    _this.playerData = res4.data;
                    _this.videoData = res5.data;
                })
            )
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

    /*首页游戏推广相关样式*/
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

    /*首页视频相关样式*/
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
</style>
<style lang="scss">
    .van-grid-item__content{
        padding: 0;
    }
</style>

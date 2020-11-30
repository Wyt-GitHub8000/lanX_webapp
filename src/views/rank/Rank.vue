<template>
    <div class="rank">
        <div class="title">
            <img src="~assets/images/rank/jiang.png" alt="">
            <span>排行榜</span>
            <h2>TOP150</h2>
        </div>
        <div>
            <van-tabs v-model="activeName" :swipeable="true">
                <van-tab title="游戏榜" name="a">
                    <ul class="game">
                        <li v-for="(item,index) in gameList">
                            <corner-marker :index="index+1"></corner-marker>
                            <img :src="item.appIcon" style="width: 60px; height: 60px; border-radius: 4px">
                            <div>
                                <div style="margin-top: 25px">
                                    <span style="width: 57px; height: 14px; font-size: 14px; color: #333; overflow: hidden; text-overflow:ellipsis; white-space: nowrap;">{{item.appName}}</span>
                                    <span style="width: 59px; height: 10px; font-size: 10px ;color: #999; margin: 0 74px 0 7px">厂商:{{item.factory}}</span>
                                    <span style="width: 40px; height: 10px; font-size: 10px; color: #25ACF1">角色扮演</span>
                                </div>
                                <div style="width: 239px; height: 26px; font-size: 10px; line-height: 16px; color: #333; margin-top: 14px">{{item.summary}}</div>
                                <div class="tag">
                                    <span>{{gameTags[0].name}}</span>
                                    <span>{{gameTags[1].name}}</span>
                                    <span>{{gameTags[2].name}}</span>
                                </div>
                            </div>
                        </li>
                    </ul>
                    <more-button></more-button>
                </van-tab>
                <van-tab title="创作者榜" name="b">
                    <ul class="player">
                        <li v-for="(item,index) in playList">
                            <corner-marker :index="index+1"></corner-marker>
                            <img :src="item.avatar">
                            <div style="margin-top: 23px">
                                <div>
                                    <span style="width: 70px; height: 14px; font-size: 14px; line-height: 14px; color: #333">{{item.nickname}}</span>
                                    <span style="width: 64px; height: 10px; font-size: 10px; line-height: 10px; color: #999; margin:0 3px 0 11px">综合得分：{{item.trend}}★</span>
                                    <!--<span style="width: 8px; height: 7px; font-size: 8px; color: #999">{{item.playXing}}</span>-->
                                </div>
                                <div style="width: 124px; height: 11px; font-size: 10px; line-height: 10px; color: #999;margin:7px 0 5px">主播领域：{{item.domain}}</div>
                                <div>
                                    <span style="width: 78px; height: 10px; font-size: 10px; line-height: 11px; color: #666">抖音号：{{item.uniqueId}}</span>
                                    <span style="width: 74px; height: 10px; font-size: 10px; line-height: 11px; color: #666;margin: 0 5px">粉丝数：{{item.followerCount}}</span>
                                    <span style="width: 63px; height: 10px; font-size: 10px; line-height: 11px; color: #666">视频数：{{item.awemeCount}}</span>
                                </div>
                            </div>
                        </li>
                    </ul>
                   <more-button></more-button>
                </van-tab>
                <van-tab title="视频榜" name="c">
                    <ul class="viedo">
                        <li v-for="(item, index) in viedosList">
                            <corner-marker :index="index+1"></corner-marker>
                            <img :src="item.thumb" style="width: 168px; height: 94px; border-radius: 4px" class="cover">
                            <span style="left: 6px"><img src="~assets/images/rank/dianzan.png">{{item.diggCount}}</span>
                            <span style="left: 51px"><img src="~assets/images/rank/pinglun.png">{{item.commentCount}}</span>
                            <span style="left: 120px"><img src="~assets/images/rank/fenxiang.png">{{item.shareCount}}</span>
                            <div style="width:168px; height: 33px; font-size: 12px; line-height: 18px; color: #333; margin: 9px 0 3px 0; display: -webkit-box; overflow: hidden; -webkit-line-clamp: 2; -webkit-box-orient: vertical;">{{item.descript}}</div>
                            <div style="width: 50px; height: 18px; font-size: 10px; line-height: 18px; color: #999; overflow: hidden; text-overflow:ellipsis; white-space: nowrap;">{{item.userName}}</div>
                        </li>
                    </ul>
                    <more-button></more-button>
                </van-tab>
            </van-tabs>
        </div>
    </div>
</template>

<script>
    import CornerMarker from 'components/content/rank/CornerMarker.vue'
    import MoreButton from 'components/content/home/MoreButton.vue'
    export default {
        name: 'Rank',
        components:{
            CornerMarker,
            MoreButton
        },
        data() {
            return {
                activeName: 'a',
                gameList:[],
                playList:[],
                viedosList:[],
                gameTags:[]
            }
        },
        methods:{
            getGamesList(){
                const params = new URLSearchParams();
                params.append('page','1');
                params.append('pageSize','5');
                return this.http.post('http://localhost:80/rank/games',params);
            },
            getPlayerList(){
                const params = new URLSearchParams();
                params.append('page','1');
                params.append('pageSize','7');
                return this.http.post('http://localhost:80/rank/kols');
            },
            getVideoList(){
                const params = new URLSearchParams();
                params.append('page','1');
                params.append('pageSize','10');
                return this.http.post('http://localhost:80/rank/awemes')
            }
        },
        mounted(){
//            this.http.get('/rank/getData').then(
//                res=>{
//                    res = res.data;
//                    this.gameList = res.gameData;
//                    this.playList = res.playData;
//                    this.viedosList = res.viedoData
//                }
//            )
            //使用后台提供的接口更换数据
            let _this = this;
            this.http.all([_this.getGamesList(),_this.getPlayerList(),_this.getVideoList()]).then(
                this.http.spread(function (res1,res2,res3) {
                    console.log('排行榜所有数据更新成功')
                    res1 = res1.data;
                    res2 = res2.data;
                    res3 = res3.data;
                    _this.gameList = res1.data;
                    _this.playList = res2.data;
                    _this.viedosList = res3.data;
                })
            )
            this.http.post('http://localhost:80/home/tags').then(
                res=>{
                    res = res.data;
                    this.gameTags = res.data;
                }
            )
        }
    }
</script>

<style lang="scss" scoped>
    .rank{
        background-color: #f2f2f2;
        position: relative;
    }
    .title{
        text-align: center;
        margin-top: 25px;
        img{
            margin-left: -85px;
        }
        span{
           position: absolute;
            left: 155px;
            top:10px;
           width: 39px;
           height: 13px;
           color: #02BAFF;
           font-size: 13px;
        }
        h2{
            position: absolute;
            width: 95px;
            height: 25px;
            font-size: 25px;
            color: #0381FF;
            left: 153px;
            top:22px;
            font-weight: 700;
        }
    }
    ul>li{
        margin-top: 15px;
    }
    .game{
        margin-top: 10px;
        li{
            width: 345px;
            height: 132px;
            background-color: #fff;
            border-radius: 4px;
            box-shadow: 0 2px 2px 0 rgba(0,0,0,.05);
            display: flex;
            position: relative;
            img{
                margin: 21px 13px 51px 20px;
            }
            span{
                display: inline-block;
            }
            .tag{
                margin-top: 14px;
                span{
                    width: 44px;
                    height: 18px;
                    background: #f6f6f6;
                    border: 1px solid #f6f6f6;
                    border-radius: 4px;
                    font-size: 8px;
                    color: #707070;
                    text-align: center;
                    line-height: 18px;
                    margin-right: 8px;
                }
            }
        }
    }
    .player{
        li{
            width: 345px;
            height: 96px;
            background: #fff;
            border-radius: 4px;
            box-shadow: 0 2px 2px 0 rgba(0,0,0,0.05);
            display: flex;
            position: relative;
            img{
                margin: 18px 10px 20px 28px;
                width: 60px;
                height: 60px;
                border-radius: 50%;
            }
        }
    }
    .viedo{
        width: 345px;
        display: flex;
        flex-wrap: wrap;
        li{
            width: 168px;
            height: 154px;
            display: block;
            position: relative;
            span{
                position: absolute;
                bottom: 65px;
                width: 39px;
                height: 10px;
                font-size: 10px;
                color: #fff;
                line-height: 11px;
                img{
                    width: 8px;
                    height: 8px;
                    margin-right: 3px;
                }
            }
        }
        li:nth-child(odd){
            margin-right: 8px;
        }
    }
</style>
<style lang="scss">
   .van-tab{
        background-color: #f2f2f2;
        font-size: 16px;
    }
   .van-tabs__line{
       background-color: #3db3ef;
       width: 75px;
   }
    .van-tab--active{
        color: #3bb3f1;
    }
</style>

<template>
    <div class="hotviedo">
        <div class="title">
            <div>热门视频推荐</div>
            <div><a>换一批</a></div>
        </div>
        <ul class="viedo">
        <li v-for="(item, index) in hotViedos">
            <img :src="imgArray[index%10]" style="width: 168px; height: 94px; border-radius: 4px">
            <span style="left: 6px"><img src="~assets/images/rank/dianzan.png">{{item.dzCount}}</span>
            <span style="left: 51px"><img src="~assets/images/rank/pinglun.png">{{item.plCount}}</span>
            <span style="left: 120px"><img src="~assets/images/rank/fenxiang.png">{{item.fxCount}}</span>
            <div style="width:168px; height: 33px; font-size: 12px; line-height: 18px; color: #333; margin: 9px 0 3px 0; display: -webkit-box; overflow: hidden; -webkit-line-clamp: 2; -webkit-box-orient: vertical;">{{item.viedoDescrib}}</div>
            <div style="width: 50px; height: 10px; font-size: 10px; line-height: 18px; color: #999">{{item.viedoCreater}}</div>
        </li>
    </ul>
    </div>
</template>

<script>
    export default {
        name: 'HotViedo',
        data(){
            return{
                hotViedos:[],
                imgArray:[
                    require('assets/images/rank/tihuan.png'),
                    require('assets/images/rank/game.png'),
                    require('assets/images/rank/tihuan.png'),
                    require('assets/images/rank/game.png'),
                    require('assets/images/rank/tihuan.png'),
                    require('assets/images/rank/game.png'),
                    require('assets/images/rank/tihuan.png'),
                    require('assets/images/rank/game.png'),
                    require('assets/images/rank/tihuan.png'),
                    require('assets/images/rank/game.png'),
                ]
            }
        },
        mounted(){
            this.http.get('/rank/getData').then(
                res =>{
                    res = res.data;
                    this.hotViedos = res.viedoData
                }
            )
        }
    }
</script>

<style lang="scss" scoped>
    .title{
        border-bottom: 1px solid #DDD;
        display: flex;
        height: 28px;
        div:first-child{
            width: 108px;
            height: 18px;
            font-size: 18px;
            color: #333;
            margin: 0 192px 10px 0;
        }
        div:last-child{
            width: 42px;
            height: 14px;
            font-size: 14px;
            color: #25acf1;
            margin-top: 3px;
        }
    }
    .viedo{
        width: 345px;
        display: flex;
        flex-wrap: wrap;
        margin-top: 10px;
        li{
            width: 168px;
            height: 154px;
            display: block;
            position: relative;
            margin-bottom: 10px;
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

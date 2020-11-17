<template>
    <div class="viedos">
        <div class="title">
            <div>排序:</div>
            <span class="current">综合排序</span>
            <span>最新视频</span>
            <span>视频热度</span>
        </div>
        <ul class="content">
            <li class="show">
                <ul class="viedo">
                    <li v-for="(item, index) in ViedoL">
                        <img :src="imgArray[index%10]" style="width: 168px; height: 94px; border-radius: 4px">
                        <span style="left: 6px"><img src="../../../assets/images/rank/dianzan.png">{{item.dzCount}}</span>
                        <span style="left: 51px"><img src="../../../assets/images/rank/pinglun.png">{{item.plCount}}</span>
                        <span style="left: 120px"><img src="../../../assets/images/rank/fenxiang.png">{{item.fxCount}}</span>
                        <div style="width:168px; height: 33px; font-size: 12px; line-height: 18px; color: #333; margin: 9px 0 3px 0; display: -webkit-box; overflow: hidden; -webkit-line-clamp: 2; -webkit-box-orient: vertical;">{{item.viedoDescrib}}</div>
                        <div style="width: 50px; height: 10px; font-size: 10px; line-height: 18px; color: #999">{{item.viedoCreater}}</div>
                    </li>
                </ul>
            </li>
            <li>这里是最新的视频</li>
            <li>这里是高热度视频</li>
        </ul>
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
    </div>
</template>

<script>
    import HotViedo from '../viedo/HotViedo.vue'
    export default {
        name: 'Viedos',
        data(){
            return{
                currentPage:1,
                ViedoL:[],
                imgArray:[
                    require('../../../assets/images/rank/tihuan.png'),
                    require('../../../assets/images/rank/game.png'),
                    require('../../../assets/images/rank/tihuan.png'),
                    require('../../../assets/images/rank/game.png'),
                    require('../../../assets/images/rank/tihuan.png'),
                    require('../../../assets/images/rank/game.png'),
                    require('../../../assets/images/rank/tihuan.png'),
                    require('../../../assets/images/rank/game.png'),
                    require('../../../assets/images/rank/tihuan.png'),
                    require('../../../assets/images/rank/game.png'),
                ]
            }
        },
        methods:{
          getViedoL(){
              this.http.get('/rank/getData').then(
                  res =>{
                      res = res.data;
                      this.ViedoL = res.viedoData
                  }
              )
          }
        },
        mounted(){
            $('.title span').click(function () {
                $(this).addClass('current');
                $(this).siblings('.current').removeClass('current');
                $('.content>li').eq($(this).index()-1).addClass('show');
                $('.content>li').eq($(this).index()-1).siblings('.show').removeClass('show');
            })
           this.getViedoL();
        }
    }
</script>

<style lang="scss" scoped>
    .viedos{
        .title{
            width: 345px;
            height: 30px;
            background: #ececec;
            border: 1px solid #ddd;
            display: flex;
            div{
                width: 28px;
                height: 12px;
                font-size: 12px;
                color: #999;
                margin: 9px 15px;
            }
            span{
                display: inline-block;
                width: 48px;
                height: 12px;
                font-size: 12px;
                color: #666;
                margin: 9px 0;
            }
            span:nth-child(3){
                margin: 9px 15px;
            }
            .current{
                color: #25acf1;
            }
        }
        .content{
            margin-bottom: 15px;
            li{
                display: none;
            }
            .show{
                display: block;
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
        }
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
                box-shadow: 0px 2px 2px 0px rgba(0, 0, 0, 0.05);
                margin: 0 2px;
                line-height: 28px;
            }
    }
</style>

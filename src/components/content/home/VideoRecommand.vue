<template>
    <div class="video-recommand">
        <ul class="viedo">
            <li v-for="(item, index) in item">
                <corner-marker :index="index+1"></corner-marker>
                <img :src="item.thumb" style="width: 168px; height: 94px; border-radius: 4px">
                <span style="left: 6px"><img src="~assets/images/rank/dianzan.png">{{item.diggCount}}</span>
                <span style="left: 51px"><img src="~assets/images/rank/pinglun.png">{{item.commentCount}}</span>
                <span style="left: 120px"><img src="~assets/images/rank/fenxiang.png">{{item.shareCount}}</span>
                <div style="width:168px; height: 33px; font-size: 12px; line-height: 18px; color: #333; margin: 9px 0 3px 0; display: -webkit-box; overflow: hidden; -webkit-line-clamp: 2; -webkit-box-orient: vertical;">{{item.descript}}</div>
                <div style="width: 50px; height: 16px; font-size: 10px; line-height: 18px; color: #999; overflow: hidden; text-overflow:ellipsis; white-space: nowrap;">{{item.userName}}</div>
            </li>
        </ul>
    </div>
</template>

<script>
    import CornerMarker from 'components/content/rank/CornerMarker.vue'

    export default {
        name: 'VideoRecommand',
        components:{
            CornerMarker
        },
        props:{
            item:Array
        }
    }
</script>

<style lang="scss" scoped>
    .video-recommand{
        margin-top: 11px;
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
            margin-bottom: 16px;
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

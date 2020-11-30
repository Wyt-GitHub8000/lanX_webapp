<template>
    <div>
        <ul>
            <li v-for="item in item">
                <div style="display: flex">
                    <img :src="item.appIcon" style="width: 40px;height: 40px;margin: 11px 12px 0 13px">
                    <div style="width: 280px; display: flex; flex-direction: column ">
                        <span style="margin:12px 0 10px 0;font-size: 14px; color: #333">{{item.appName}}</span>
                        <span style="color: rgb(112,112,112);font-size: 10px; display: -webkit-box; overflow: hidden; -webkit-line-clamp: 2; -webkit-box-orient: vertical;">{{item.summary}}</span>
                    </div>
                </div>
                <img src="~assets/images/home/aaa.png" alt="">
            </li>
        </ul>
    </div>
</template>

<script>
    export default {
        name: 'GameRecommand',
        props:{
            item:Array
        }
    }
</script>

<style lang="scss" scoped>
    ul>li{
        margin-top: 8px;
    img{
        width: 100%;
        height: 140px;
        border-radius: 3px;
    }
    div{
        height: 66px;
        background-color: #fff;
        border-radius: 3px;
    }
    }
</style>

<template>
    <div>
        <div class="creater">
            <span>创作者排行榜</span>
            <a href="">更多</a>
        </div>
        <div style="margin-top: 9px">
            <ul class="playerlist">
                <li style="display: flex; align-items: center" v-for="(item,index) in item" @click="playerClick(item,index)">
                    <span style="font-size: 12px; color: #FE931B; margin:0 13px">{{index+1}}</span>
                    <img :src="item.avatar" style="width: 40px; height: 40px; border-radius: 50%">
                    <div style="display: flex; flex-direction: column; margin-left: 8px">
                        <span style="font-size: 12px; color: #333; margin: 6px 0 6px">{{item.nickname}}</span>
                        <span style="font-size: 10px; color: #9D9D9D">综合得分:{{item.trend}}★</span>
                    </div>
                </li>
            </ul>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'PlayerRank',
        props:{
            item:Array
        },
        methods:{
            playerClick(item,index){
                if(index ===0){
                    this.$store.commit('copyPlayerMessage',item);
                    this.$router.push('/playerdetails');
                }
            }
        }
    }
</script>

<style lang="scss" scoped>
    .creater{
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
    .playerlist{
        display: flex;
        width: 351px;
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

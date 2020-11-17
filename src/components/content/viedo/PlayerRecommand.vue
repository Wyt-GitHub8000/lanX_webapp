<template>
    <div class="playrecommand">
        <div class="title">
            <div>创作者推荐</div>
            <div @click="morePlayer"><slot></slot></div>
        </div>
        <ul class="player">
            <li v-for="(item,index) in item">
                <img :src="imgArray[index%8]">
                <div>
                    <div style="width: 60px; height: 12px; font-size: 12px; color: #333; margin: 20px 0 9px 0">{{item.playName || item.gameName}}</div>
                    <div style="width: 74px; height: 11px; font-size: 10px; color: #666;">{{item.playFiled}}/{{item.gameType}}</div>
                </div>
            </li>
        </ul>
    </div>
</template>

<script>
    export default {
        name: 'PlayerRecommand',
        data(){
            return {
                imgArray:[
                    require('assets/images/viedo/t1.png'),
                    require('assets/images/viedo/t2.png'),
                    require('assets/images/viedo/t3.png'),
                    require('assets/images/viedo/t4.png'),
                    require('assets/images/viedo/t5.png'),
                    require('assets/images/viedo/t6.png'),
                    require('assets/images/viedo/t1.png'),
                    require('assets/images/viedo/t4.png'),
                ]
            }
        },
        props:{
            item:Array
        },
        methods:{
            morePlayer(){
                this.$router.push('/viedo/more')
            }
        }
    }
</script>

<style lang="scss" scoped>
    .playrecommand{
        margin-top: 16px;
        .title{
            border-bottom: 1px solid #DDD;
            display: flex;
            height: 28px;
            div:first-child{
                width: 90px;
                height: 18px;
                font-size: 18px;
                color: #333;
                margin: 0 224px 10px 0;
            }
            div:last-child{
                width: 28px;
                height: 14px;
                font-size: 14px;
                color: #25acf1;
                margin-top: 3px;
            }
        }
        .player{
            display: flex;
            flex-wrap: wrap;
            margin-bottom: 15px;
            li{
                width: 167px;
                height: 74px;
                background: #fff;
                border-radius: 4px;
                box-shadow: 0 2px 2px 0 rgba(0,0,0,0.05);
                margin-top: 10px;
                display: flex;
                img{
                    width: 48px;
                    height: 48px;
                    margin: 11px 10px 0 17px;
                    border-radius: 50%;
                }
            }
            li:nth-child(odd){
                margin-right: 10px;
            }
        }
    }
</style>

<template>
    <div class="find">
        <div style="display: flex; border-bottom: 1px solid #ddd">
            <div style="width: 90px; height: 18px; font-size: 18px; color: #333333; margin: 16px 224px 10px 0"><slot></slot></div>
            <div style="width: 28px; height: 14px; font-size: 14px; color: #25acf1; margin: 20px 0 10px 0"><a @click="moreclick">更多</a></div>
        </div>
        <ul class="clearfix">
            <li v-for="item in item">
                <img src="../../../assets/images/find/tx.png">
                <div>
                    <div style="width: 24px; height: 12px; font-size: 12px; color: #333; margin: 20px 75px 9px 0">{{item.gameName}}</div>
                    <div style="width: 40px; height: 10px; font-size: 10px; color: #666;">{{item.gameType}}</div>
                </div>
            </li>
        </ul>
    </div>
</template>

<script>
    export default {
        name: 'Found',
        props:{
            item:Array
        },
        methods:{
            moreclick(){
                this.$router.push('/find/more')
            }
        }
    }
</script>

<style lang="scss" scoped>
    .find{
        ul{

            li{
                display: flex;
                float: left;
                margin-top: 9px;
                width: 169px;
                height: 74px;
                background: #fff;
                border-radius: 4px;
                box-shadow: 0 2px 2px 0 rgba(0,0,0,0.05);
                img{
                    width: 48px;
                    height: 48px;
                    margin: 11px 10px 15px 17px;
                }
            }
            li:nth-child(odd){
                margin-right: 7px;
            }
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

<template>
    <div class="news">
        <div class="title">
            <span></span>
            <slot @click="moreClick"></slot>
            <span @click="moreClick"><a>更多</a></span>
        </div>
        <div class="content">
            <ul>
                <li v-for="item in item">
                    <div>
                        <div style="width: 200px; height: 32px; font-size: 14px; line-height: 18px; color: #333; margin: 12px 15px 10px 0">{{item.newsTitle}}</div>
                        <div>
                            <span style="width: 53px; height: 11px; font-size: 10px; line-height: 9px; color: #999; margin-right: 18px">{{item.newsDate}}</span>
                            <span style="width: 73px; height: 10px; font-size: 10px; line-height: 9px; color: #999">作者名:{{item.newsCreater}}</span>
                        </div>
                    </div>
                    <img src="../../../assets/images/news/tx.png">
                </li>
            </ul>
        </div>
    </div>
</template>

<script>
    export default {
        name: 'NewsList',
        props:{
            item:Array,
        },
        methods:{
            moreClick(){
                this.$router.push('/news/more')
            }
        }
    }
</script>

<style lang="scss" scoped>
    .news{
        width: 100%;
        background: #ffffff;
        border-radius: 4px;
        box-shadow: 0px 2px 2px 0px rgba(0,0,0,0.05);
        margin-top: 11px;
    .title{
        width: 100%;
        height: 33px;
        border-bottom: 1px solid #f2f2f2;
        line-height: 33px;
    span{
        display: inline-block;
    }
    span:nth-child(1){
        width: 2px;
        height: 12px;
        background: #25acf1;
        margin-left: 14px;
    }
    span:nth-child(2){
        width: 72px;
        height: 12px;
        font-size: 12px;
        font-weight: 400;
        text-align: left;
        color: #333333;
        margin: 0 211px 0 8px;
    }
    span:nth-child(3){
        width: 24px;
        height: 12px;
        font-size: 12px;
        font-weight: 400;
        text-align: left;
        color: #25acf1;
    }
    }
    .content{
    ul{
    li{
        width: 316px;
        height: 77px;
        margin: 0 17px 0 12px;
        border-bottom: 1px solid #F2F2F2;
        display: flex;
    img{
        width: 98px;
        height: 56px;
        margin-top: 12px;
    }
    }
    li:last-child{
        border-bottom: none;
    }
    }
    }
    }
</style>

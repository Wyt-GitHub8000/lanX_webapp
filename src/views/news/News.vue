<template>
    <div>
        <van-swipe class="my-swipe" :autoplay="3000" indicator-color="white">
            <van-swipe-item><img src="../../assets/images/news.jpg" alt=""></van-swipe-item>
            <van-swipe-item><img src="../../assets/images/news2.jpg" alt=""></van-swipe-item>
            <van-swipe-item><img src="../../assets/images/news3.png" alt=""></van-swipe-item>
            <van-swipe-item><img src="../../assets/images/news.jpg" alt=""></van-swipe-item>
        </van-swipe>

        <news-list :item="newList"><span>游戏相关新闻</span></news-list>
        <news-list :item="newList"><span>机构相关新闻</span></news-list>

    </div>
</template>

<script>
    import NewsList from '../../components/content/news/NewsList.vue'
    export default {
        name: 'News',
        components:{
          NewsList
        },
        data(){
            return{
                newList:[],
            }
        },
        mounted(){
            this.http.get('/news/getData').then(
                res=>{
                    res = res.data;
                    console.log(res.newsData)
                    this.newList = res.newsData
                }
            )
        }
    }
</script>

<style lang="scss" scoped>
    .my-swipe .van-swipe-item {
        img {
            width: 100%;
            height: 192px;
            border-radius: 4px;
        }
    }
</style>

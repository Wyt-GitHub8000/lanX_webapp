<template>
    <div class="more">
        <div class="header-warp"><common-header></common-header></div>
        <div class="content-warp">
            <player-recommand :item="list"></player-recommand>
            <van-pagination v-model="page.currentPage" :total-items="140" :show-page-size="page.currentPage ==5 || page.currentPage == 6 ? 6 :7"
                            :page-count="page.pageTotal" force-ellipses @change="curPage()">
                <template #prev-text>
                    <van-icon name="arrow-left" />
                </template>
                <template #next-text>
                    <van-icon name="arrow" />
                </template>
                <template #page="{ text }">{{ text }}</template>
            </van-pagination>
        </div>
        <div class="footer-warp"><common-footer></common-footer></div>
    </div>
</template>

<script>
    import CommonHeader from 'components/common/CommonHeader.vue'
    import CommonFooter from 'components/common/CommonFooter.vue'

    import PlayerRecommand from 'components/content/viedo/PlayerRecommand.vue'

    export default {
        name: 'More',
        components: {
            CommonHeader,
            CommonFooter,
            PlayerRecommand
        },
        data(){
           return {
               list:[],
               page:{
                   pageTotal:1,
                   rows:14,
                   currentPage:1,
                   pageSize:14
               }
           }
        },
        mounted(){
            this.getList()
        },
        methods:{
            getList(){
                this.http.get('/more/page/'+this.page.currentPage+'/'+this.page.pageSize).then(
                    res =>{
                        res = res.data;
                        this.list = res.pageData;
                        this.page.pageTotal = res.pageTotal;
                        this.page.rows = res.pageRows;
                    }
                )
            },
            curPage(){
                this.getList()
            }
        }
    }
</script>

<style lang="scss" scoped>
    *{
        margin: 0;
        padding: 0;
    }
    .more{
        display: flex;
        flex-direction: column;
        min-height: 100vh;
    }
    .header-warp{
        width: 100%;
        height: 52px;
    }
    .content-warp{
        width: 100%;
        flex: 1;
        border:15px solid #f2f2f2;
        border-top: 10px solid #f2f2f2;
        border-bottom: 16px solid #f2f2f2;
        background-color: #f2f2f2;
    }
    .footer-warp{
        width: 100%;
        height: 176px;
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

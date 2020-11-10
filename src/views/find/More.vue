<template>
    <div class="more">
        <div class="header-warp"><common-header></common-header></div>
        <div class="content-warp">
            <div style="width: 100%; height: 39px; font-size: 18px; color: #333; border-bottom: 1px solid #ddd; padding-top: 11px">每日新发现</div>
            <ul class="clearfix list">
                <li v-for="item in lists">
                    <img src="../../assets/images/find/m.png">
                    <div>
                        <div style="width: 48px; height: 12px; font-size: 12px; color: #333; margin: 20px 0 9px 0">{{item.gameName}}</div>
                        <div style="width: 40px; height: 10px; font-size: 10px; color: #666;">{{item.gameType}}</div>
                    </div>
                </li>
            </ul>
            <div>
                <ul class="pagination">
                    <li :class="this.page.pageNo<=1 ? 'disabled' : ''" @click="prePage()"><</li>
                    <li :class="page.pageNo==index?'active':''" v-for="index in page.pageTotal" @click="curPage(index)">{{index}}</li>
                    <li :class="this.page.pageNo>=this.page.pageTotal?'disabled':''" @click="nextPage()">></li>
                </ul>
            </div>
        </div>
        <div class="footer-warp"><common-footer></common-footer></div>
    </div>
</template>

<script>
    import CommonHeader from '../../components/common/CommonHeader.vue'
    import CommonFooter from '../../components/common/CommonFooter.vue'

    export default {
        name: 'More',
        data() {
            return {
                lists:[],               // 列表数据
                page:{
                    pageTotal:10,       // 总页数
                    rows:1,           // 总条数
                    pageNo:1,         // 页码
                    pageSize:14      // 每页条数
                },
            }
        },
        components: {
            CommonHeader,
            CommonFooter,
        },
        methods:{
            getLists:function (i) {
                    this.page.pageNo = i || this.page.pageNo
                    this.http.get('/more/page/'+this.page.pageNo+'/'+this.page.pageSize).then(
                    res=>{
                        res = res.data;
                        this.lists = res.pageData;
                        this.page.pageTotal = res.pageTotal;
                        this.page.rows = res.pageRows
                    }
                )
            },
            curPage:function (index) {
               //获取所点击页面的数据
                this.getLists(index)
            },
            prePage:function () {
               if(this.page.pageNo>1){
                   this.page.pageNo--;
                   this.getLists(this.page.pageNo)
               }
            },
            nextPage:function () {
                if(this.page.pageNo<this.page.pageTotal){
                    this.page.pageNo++;
                    this.getLists(this.page.pageNo)
                }
            }
        },
        mounted(){
            this.getLists();
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
    .content-warp {
        width: 100%;
        flex: 1;
        border: 15px solid #f2f2f2;
        border-top: 10px solid #f2f2f2;
        border-bottom: 16px solid #f2f2f2;
        background-color: #f2f2f2;
        .list{
            margin: 9px 0 14px 0;
            li{
                display: flex;
                float: left;
                width: 169px;
                height: 74px;
                background: #fff;
                border-radius: 4px;
                margin-bottom: 7px;
                box-shadow: 0px 2px 2px 0px rgba(0,0,0,0.05);
                img{
                    width: 48px;
                    height: 48px;
                    margin: 13px 10px 15px 17px;
                }
            }
            li:nth-child(odd){
                margin-right: 7px;
            }
        }
        .pagination{
            li{
                float: left;
                width: 28px;
                height: 28px;
                background: #ffffff;
                border: 1px solid #cbcbcb;
                border-radius: 4px;
                box-shadow: 0px 2px 2px 0px rgba(0,0,0,0.05);
                margin: 0 2px;
                text-align: center;
                line-height: 28px;
                font-size: 10px;
                color: #707070;
            }
            .active{
                color: #fff;
                background-color: #25acf1;
            }
            .disabled{
                pointer-events: none;
                background-color: #ccc;
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
    .footer-warp{
        width: 100%;
        height: 176px;
    }
</style>

<template>
    <div class="viedo">
        <div>
            <img src="~assets/images/viedo/lb.png">
            <div style="display: flex">
                <div style="flex: 1; height: 60px; opacity: 0.85; background: #333; font-size: 14px; color: #fff; line-height: 20px; text-align: center; padding-top: 8px">#忍者必须死3 快快快来换吧！晚了可能就没了！</div>
                <div style="flex: 1; height: 60px; opacity: 0.69; background: #333; font-size: 14px; color: #fff; line-height: 20px; text-align: center; padding-top: 8px">#忍者又活了3 赶紧来领礼包！晚了就被我抢了！</div>
            </div>
        </div>
        <player-recommand :item="playArray"><a>更多</a></player-recommand>
        <hot-viedo></hot-viedo>
    </div>
</template>

<script>
    import PlayerRecommand from 'components/content/viedo/PlayerRecommand.vue'
    import HotViedo from 'components/content/viedo/HotViedo.vue'

    export default {
        name: 'Viedo',
        components:{
            PlayerRecommand,
            HotViedo
        },
        data(){
            return {
                playArray:[]
            }
        },
        mounted(){
            this.http.get('/viedo/getData').then(
                res=>{
                    res = res.data;
                    this.playArray = res.playData;
                }
            )
        }
    }
</script>

<style lang="scss" scoped>
    .video{
        img{
            display: block;
            border-radius: 4px;
        }
    }
</style>

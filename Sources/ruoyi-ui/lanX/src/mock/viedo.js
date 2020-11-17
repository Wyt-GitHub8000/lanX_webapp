import Mock from 'mockjs'

let playL = []

export default {
    getViedoData:()=>{
        for(let i=0;i<8;i++){
            playL.push({
                playName:Mock.Random.ctitle(4,4),
                playFiled:Mock.Random.ctitle(4,4),
                gameType:Mock.Random.ctitle(3,3)
            })
        }
        return {
            code:2000,
            playData:playL
        }
    }
}
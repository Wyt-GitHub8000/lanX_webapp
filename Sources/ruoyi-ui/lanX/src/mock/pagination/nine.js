import Mock from 'mockjs'

let page9=[]

export default {
    getPage9Data:()=>{
        for(let i=0;i<14;i++){
            page9.push(Mock.mock(
                {
                    gameName:Mock.Random.ctitle(4,4),
                    gameType:Mock.Random.ctitle(2,2)
                }
            ))
        }
        return {
            code:2000,
            pageTotal:10,
            pageRows:140,
            pageData:page9
        }
    }
}
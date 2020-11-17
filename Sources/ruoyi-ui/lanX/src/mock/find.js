import Mock from 'mockjs'

let findsList =[]

export default {
    getFindData:()=>{
        for(let i=0;i<8;i++){
            findsList.push(
                Mock.mock({
                    gameName:Mock.Random.ctitle(2),
                    gameType:Mock.Random.ctitle(4)
                })
            )
        }
        return{
            code:2000,
            findData:findsList
        }
    }
}
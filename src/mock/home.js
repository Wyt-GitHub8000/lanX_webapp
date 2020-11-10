//模拟数据接口

import Mock from 'mockjs'

let list = [];
let listplayer = []
export default {
    getHomeData: ()=>{
        for(let i=0;i<3;i++){
           list.push(Mock.mock({
               gameName: Mock.Random.ctitle(4),
               gamedetail: Mock.Random.cparagraph(1)
            })
           )
        }
        for(let i=0;i<6;i++){
            listplayer.push(
                Mock.mock({
                    playerName: Mock.Random.ctitle(4),
                    playerCore: Mock.Random.string("★",3,5)
                })
            )
        }
        return {
            code: 2000,
            data: list,
            data1:listplayer
        }
}
}


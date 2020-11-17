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
                    playerClass:Mock.Random.float(3,4,1,1),
                    playerCore: Mock.Random.string("★",3,5),
                    playerField:Mock.Random.ctitle(3,4),
                    playerId:Mock.Random.string('ab1wls8rt3d',5,7),
                    playerFans:Mock.Random.integer(103655,256393),
                    playerWorks:Mock.Random.integer(1009,3590)
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


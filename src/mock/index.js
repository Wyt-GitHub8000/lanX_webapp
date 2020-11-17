// 安装后导入mock模拟服务器
import Mock from 'mockjs'

//服务器有好多功能,提供数据只是之一.前端开发人员访问数据时,服务器会给我们接到数据空间的接口
import homeApi from './home'
import rankApi from './rank'
import newsApi from './news'
import findApi from './find'
import viedoApi from './viedo'

import page1Api from './pagination/one'
import page2Api from './pagination/two'
import page3Api from './pagination/three'
import page4Api from './pagination/four'
import page5Api from './pagination/five'
import page6Api from './pagination/six'
import page7Api from './pagination/seven'
import page8Api from './pagination/eight'
import page9Api from './pagination/nine'
import page10Api from './pagination/ten'

//Mock模拟网络延时
Mock.setup({
    timeout: '100-300'
})

//处理拦截到的各种请求,接收到拦截的请求后调用数据空间接口
Mock.mock(/\/home\/getData/,'get',homeApi.getHomeData)
Mock.mock(/\/rank\/getData/,'get',rankApi.getRankData)
Mock.mock(/\/news\/getData/,'get',newsApi.getNewsData)
Mock.mock(/\/find\/getData/,'get',findApi.getFindData)
Mock.mock(/\/viedo\/getData/,'get',viedoApi.getViedoData)

//处理分页请求
Mock.mock(/\/more\/page\/1\/14/,'get',page1Api.getPage1Data)
Mock.mock(/\/more\/page\/2\/14/,'get',page2Api.getPage2Data)
Mock.mock(/\/more\/page\/3\/14/,'get',page3Api.getPage3Data)
Mock.mock(/\/more\/page\/4\/14/,'get',page4Api.getPage4Data)
Mock.mock(/\/more\/page\/5\/14/,'get',page5Api.getPage5Data)
Mock.mock(/\/more\/page\/6\/14/,'get',page6Api.getPage6Data)
Mock.mock(/\/more\/page\/7\/14/,'get',page7Api.getPage7Data)
Mock.mock(/\/more\/page\/8\/14/,'get',page8Api.getPage8Data)
Mock.mock(/\/more\/page\/9\/14/,'get',page9Api.getPage9Data)
Mock.mock(/\/more\/page\/10\/14/,'get',page10Api.getPage10Data)

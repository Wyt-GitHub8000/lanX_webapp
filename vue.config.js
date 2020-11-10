const webpack = require('webpack')
module.exports = {
    devServer: {
        port: 3333,
        public: '169.254.107.190:3333',
        open: true,
        /* 设置前端代理解决跨域访问问题
         proxy: {

         }*/
    },
    css: {
        loaderOptions: {
            sass: {
                prependData: '@import "@/assets/scss/_variable.scss";'
            }
        }
    },
    configureWebpack: {
        plugins: [
            new webpack.ProvidePlugin({
                $: "jquery",
                jQuery: "jquery",
                "windows.jQuery": "jquery"
            })
        ]
    }
}
<template>
    <div class="more">
        <button>更多</button>
    </div>
</template>

<script>
    export default {
        name: 'MoreButton',
    }
</script>

<style lang="scss" scoped>
    .more {
        width: 100%;
        height: 45px;
        display: flex;
        justify-content: center;
        align-items: center;
        button {
            width: 53px;
            height: 25px;
            font-size: 10px;
            background-color: #25acf1;
            color: #e8f6fd;
            border: 1px solid #25acf1;
            border-radius: 3px;
        }
    }
</style>

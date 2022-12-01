package inde.luzhao.summernet.context;

public enum MessageType {
    //服务提供者
    DISCOVER_SERVER(1001), //发现服务
    DELETE_SERVER(1002), //删除服务

    //服务调用者
    FIND_SERVER(2001), //向注册中心查询服务
    FIND_SERVER_STATUS(2002), //向注册中心查询服务状态

    //操作注册中心
    EXECUTE_OK(3001), //注册中心执行操作成功
    EXECUTE_NO(3002), //注册中心执行某操作失败

    //查询注册中心
    FIND_SERVER_OK(3011), //注册中心返回服务
    FIND_SERVER_NO(3012), //注册中心无法返回服务

    //服务调用者和提供者之间
    EXECUTE_SERVER(4001), //调用服务
    NORMAL_RESULT(4012), //服务调用正常执行
    ERROR_RESULT(4013), //服务执行异常
    ;
    private int code;

    MessageType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    /**
     * 通过枚举的值查找枚举
     * @param code
     * @return
     */
    public MessageType findCode(int code) {
        for ( var i : MessageType.values() ) {
            if ( i.getCode() == code ) {
                return i;
            }
        }
        return null;
    }
}

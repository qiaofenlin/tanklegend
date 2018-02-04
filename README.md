controller调用service中的方法.当请求进来之后执行的过程是要抛异常.这些异常有handle来处理.

20180204
一.异常统一管理
1.通过建立一个泛型类来定义异常结果.
2.逻辑在一个地方处理(service),另一个地方专门的异常服务(Exception).
3.有一个捕获异常的类(handle)
4.为了同意管理好异常的种类,建立一个枚举类.

二.测试整个工程
    mvn clean package -Dmaven.test.skip=true  这个是直接跳过单元测试.

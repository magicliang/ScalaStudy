package main.scala.non_sbt

/**
  * object 用来制作开箱机用的单例。特别适合拿来做static 方法的容器，但也是允许有内部状态的。
  * 同名的 object 和 class 互为伴生对象和伴生类，可以互相访问内部的私有状态，但必须在同一个文件内被定义。
  * object 在第一次访问时会被初始化。
  *
  * @author liangchuan
  */
object Hello extends App {
  println("Hello world!")
}

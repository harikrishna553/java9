
module app.interfaces.impl{
  requires app.interfaces;

  provides com.sample.app.interfaces.Circle
   with com.sample.app.interfaces.impl.CircleImpl;
}

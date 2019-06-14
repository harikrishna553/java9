module app.interfaces.otherimpl{
  requires app.interfaces;

  provides com.sample.app.interfaces.Circle
   with com.sample.app.interfaces.otherimpl.CircleImpl;
}

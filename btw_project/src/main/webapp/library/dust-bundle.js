(function(dust){dust.register("foo",body_0);function body_0(chk,ctx){return chk.w("1 : ").f(ctx.get(["foo"], false),ctx,"h").p("folder1/foo",ctx,ctx,{});}body_0.__dustBody=!0;return body_0}(dust));
(function(dust){dust.register("folder1\/foo",body_0);function body_0(chk,ctx){return chk.w("2 : ").f(ctx.getPath(false, ["x","foo"]),ctx,"h");}body_0.__dustBody=!0;return body_0}(dust));

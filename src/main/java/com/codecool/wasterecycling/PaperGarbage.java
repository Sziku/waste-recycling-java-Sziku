package com.codecool.wasterecycling;

public class PaperGarbage extends Garbage {
        private boolean squeezable;

        protected PaperGarbage(String name, boolean squeezable) {
                super(name);
                this.squeezable=squeezable;
        }

        public boolean isSqueezed() {
                return squeezable;
        }

      public  void squeeze(){
                if (!squeezable){
                        squeezable=true;
                }
      }
}

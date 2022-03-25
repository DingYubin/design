package patterns.creation.builder.constructor;

/**
 * 在ConstructorArg类种，
 * 当isRef为true的时候，arg表示String类型的refBeanId，type不需要设置；
 * 当idRef为false的时候，arg、type都需要设置。
 */
public class ConstructorArg {
    private boolean isRef;
    private Class type;
    private Object arg;

    public ConstructorArg(Builder builder){
        isRef = builder.isRef;
        type = builder.type;
        arg = builder.arg;
    }

    public static Builder newBuilder(){
        return new Builder();
    }


    public Class getType() {
        return type;
    }

    public Object getArg() {
        return arg;
    }

    public void setArg(Object arg) {
        this.arg = arg;
    }

    public static final class Builder{
        private boolean isRef;
        private Class type;
        private Object arg;

        private Builder(){}

        public Builder isRef(boolean isRef){
            if (isRef && this.type != null){
                throw new IllegalArgumentException(".");
            }
            this.isRef = isRef;
            return this;
        }

        public Builder type(Class type){
            if (isRef && type == null){
               throw new IllegalArgumentException("..");
            }

            this.type = type;
            return this;
        }

        public Builder arg(Object refBeanId){
            if (isRef && (refBeanId != null && refBeanId.getClass() != String.class)){
               throw new IllegalArgumentException("...");
            }

            if (!isRef && refBeanId == null){
                throw new IllegalArgumentException("....");
            }

            this.arg = refBeanId;
            return this;
        }

        public ConstructorArg build(){
            if (isRef && type != null){
                throw new IllegalAccessError(".....");
            }

            if (!isRef && type == null){
                throw new IllegalArgumentException("......");
            }

            if (isRef && (arg != null && arg.getClass() != String.class)){
                throw new IllegalArgumentException(".......");
            }

            if (!isRef && arg == null){
                throw new IllegalArgumentException("........");
            }

            return new ConstructorArg(this);
        }

    }
}

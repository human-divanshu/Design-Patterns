package com.thejavauniversity.designpatterns.builder;

public class SampleBuilder {

    // required fields
    private String field1;
    private String field2;

    // optional fields
    private String field3;
    private String field4;

    SampleBuilder(Builder builder) {
        this.field1 = builder.field1;
        this.field2 = builder.field2;
        this.field3 = builder.field3;
        this.field4 = builder.field4;
    }

    @Override
    public String toString() {
        return "SampleBuilder{" +
                "field1='" + field1 + '\'' +
                ", field2='" + field2 + '\'' +
                ", field3='" + field3 + '\'' +
                ", field4='" + field4 + '\'' +
                '}';
    }

    public static class Builder {
        // required fields
        private String field1;
        private String field2;

        // optional fields
        private String field3;
        private String field4;

        Builder(String field1, String field2) {
            this.field1 = field1;
            this.field2 = field2;
        }

        public Builder field3(String field3) {
            this.field3 = field3;
            return this;
        }

        public Builder field4(String field4) {
            this.field4 = field4;
            return this;
        }

        public SampleBuilder build() {
            return new SampleBuilder(this);
        }
    }
}

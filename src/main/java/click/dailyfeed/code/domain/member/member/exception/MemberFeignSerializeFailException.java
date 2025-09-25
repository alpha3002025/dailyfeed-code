package click.dailyfeed.code.domain.member.member.exception;

import click.dailyfeed.code.domain.member.member.code.MemberExceptionCode;

import java.util.function.Supplier;

public class MemberFeignSerializeFailException extends MemberException {
    public MemberFeignSerializeFailException() {
        super(MemberExceptionCode.FEIGN_SERIALIZE_FAIL);
    }

    public MemberFeignSerializeFailException(Supplier<String> messageSupplier) {
        super(MemberExceptionCode.FEIGN_SERIALIZE_FAIL, messageSupplier);
    }
}

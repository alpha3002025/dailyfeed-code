package click.dailyfeed.code.global.feign.exception;

import click.dailyfeed.code.global.feign.code.FeignExceptionCode;

public class FeignApiSerializationFailException extends FeignException{
    public FeignApiSerializationFailException() {
        super(FeignExceptionCode.API_SERIALIZATION_FAIL);
    }
}

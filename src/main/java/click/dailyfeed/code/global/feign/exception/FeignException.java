package click.dailyfeed.code.global.feign.exception;

import click.dailyfeed.code.global.feign.code.FeignExceptionCode;

public class FeignException extends RuntimeException{
    public FeignException(FeignExceptionCode feignExceptionCode){
        super(feignExceptionCode.getMessage());
    }
}

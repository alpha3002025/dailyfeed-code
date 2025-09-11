package click.dailyfeed.code.global.feign.exception;

import click.dailyfeed.code.global.feign.code.FeignExceptionCode;

public class FeignApiCommunicationFailException extends FeignException{
    public FeignApiCommunicationFailException() {
        super(FeignExceptionCode.API_COMMUNICATION_FAIL);
    }
}

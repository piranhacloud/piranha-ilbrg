# Manorrock Spider

[![build](https://github.com/manorrock/spider/actions/workflows/build.yml/badge.svg)](https://github.com/manorrock/spider/actions/workflows/build.yml)

Manorrock Spider is an intelligent web application that you can use for various
purposes. E.g you can use it as a load balancer, an API gateway, an SSL 
terminator, a web  application router, a rate limiter, or a circuit breaker.

## Running using the container image from GHCR

In an EMPTY directory of your choice use the following command line to start 
Manorrock Persian:

```shell
  docker run --rm -d -it -p 8080:8080 -v $PWD:/mnt ghcr.io/manorrock/spider
```

## How do I contribute?

See [Contributing](CONTRIBUTING.md)

## Our code of Conduct

See [Code of Conduct](CODE_OF_CONDUCT.md)

## Important notice

Note if you file issues, answer questions and/or issue pull requests you agree
that those contributions will be owned by Manorrock.com and that Manorrock.com 
can use those contributions in any manner Manorrock.com so desires.

module github.com/redhat-developer/tekton-jsongenerator

go 1.14

require (
	github.com/iancoleman/orderedmap v0.0.0-20190318233801-ac98e3ecb4b0
	github.com/tektoncd/pipeline v0.35.0
	github.com/tektoncd/triggers v0.19.0
	k8s.io/apiextensions-apiserver v0.23.4
	k8s.io/apimachinery v0.23.5
	knative.dev/pkg v0.0.0-20220329144915-0a1ec2e0d46c
)

replace github.com/google/cel-go => github.com/google/cel-go v0.9.0

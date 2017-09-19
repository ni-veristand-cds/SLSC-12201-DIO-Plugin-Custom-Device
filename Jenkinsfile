#!/usr/bin/env groovy
//Leave the above line alone.  It identifies this as a groovy script.
@Library('vs-common-build') _

def nodeLabel = 'dcaf'
def lvVersions = ["2016"]
def sourceVersion = '2016'
def packageType = ni.vsbuild.PackageType.NIPM
def officialSupport = false

def buildInfo = new ni.vsbuild.BuildInformation(nodeLabel, sourceVersion, lvVersions, packageType, officialSupport)

ni.vsbuild.PipelineExecutor.execute(this, buildInfo)

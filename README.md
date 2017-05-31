# WELCOME YOU TO DESIGN PATTERN [![Build Status](https://travis-ci.org/nomensa/jquery.hide-show.svg)](https://travis-ci.org/nomensa/jquery.hide-show.svg?branch=master)
 -  Nickname: "Lorence"
 -  Hopies: Socer and Chess
 -  Major: Programmer
 -  Address: VietName

- [Agenda](#agenda)
	- ##Introduction(#introduction)
	- ##Step(#step)

##Introduction

		- There is a need to add new properties for object.
        - Readmore ...

##Step

	- A: Distinguish domain(client) and backend code
		- Create bean in serve: Interface(Bean): User(=> We call object in bean)
		- Definite place that process Logic Business with method => (Abstract)
<p align="center">
  <img src="https://github.com/danisluis6/Android-External-Libraries/blob/master/SourcesCode/1.png">
</p>
	- B: Create AbstractClass
		- For example: AbstractUser
<p align="center">
  <img src="https://github.com/danisluis6/Android-External-Libraries/blob/master/SourcesCode/2.png">
</p>
	- C: Domain [Process will be placed in client]
		- Extends AbstractUser: Teacher and parent
<p align="center">
  <img src="https://github.com/danisluis6/Android-External-Libraries/blob/master/SourcesCode/3.png">
</p>
		- Using available interface to create new interface => Get value from 			interface
<p align="center">
  <img src="https://github.com/danisluis6/Android-External-Libraries/blob/master/SourcesCode/4.png">
</p>


		





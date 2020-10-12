Feature: googleTest
Scenario: find kitten images on google
	Given We can open google
	When we search for kittens
	Then google will return us images of kittens
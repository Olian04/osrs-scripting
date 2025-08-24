ifeq ($(OS),Windows_NT)
	GRADLEW = .\gradlew.bat
else
	GRADLEW = ./gradlew
endif

run: clean test build

.PHONY: build
build:
	$(GRADLEW) build
	cp -r build/libs/*.jar ~/.runelite/plugins/

.PHONY: test
test:
	$(GRADLEW) test

.PHONY: clean
clean:
	$(GRADLEW) clean
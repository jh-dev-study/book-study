## PROPOSAL 31 ~ PROPOSAL 36

### 31 이봐 프레드, 해시맵 좀 전해 주겠는가? (커크 페퍼다인)
  - 프로그램을 작성할 때 중요한 부분은 어휘(vocabulary)다.
  - 우리가 사용하는 단어는 우리 손에 들려있는 문제를 생각하는 방법에도 영향을 미친다.
  - 코드 구조, 알고리즘, API 형태, 시스템이 목적에 부합하는 정도, 시스템 유지보수와 확장 용이성 등에 영향을 미친다.
  - 따라서 우리가 코드를 작성할 때 사용하는 어휘는 매우 중요하다.

<br>

### 32 널(Null)을 피하는 방법 (카를로스 오브레건)
  - 널은 실수다.
  - 널 값을 가질 수 있는 객체를 참조하면 이 객체의 메서드를 호출하기 전에 반드시 객체가 널 값을 가졌는지 확인할 것을 기억해야 한다.
  - 하지만 널 참조와 널이 아닌 참조 간에 명확한 차이가 없으므로 이 사실을 잊어버리고, 결국 NullPointerException이 발생하게 된다.
  - 이 문제를 회피할 수 있는 안전한 방법은 가능하면 다른 방법을 사용하는 것이다.
    - 변수를 널 값으로 초기화하지 말자.
    - 널 값을 리턴하지 말자.
      - Optional<T> 리턴은 코드를 더욱 명확하게 만든다.
    - 널 값 매개변수를 전달하거나 받지 말자.
    - 허용될 수 있는 널 값
      - 애트리뷰트(attribute)의 값을 다루는 클래스의 상세 구현에서 널 값을 허용할 수 있다.
    - 다음 예를 살펴보자.

```java
// 잘못된 코드
public String getEllipsifiedPageSummary(Path path) {
    String summary = null;
    Resource resource = this.resolver.resolve(path);
    if (resource.exists()) {
        ValueMap properties = resource.getProperties();
        summary = properties.get("summary");
    } else {
        summary = "";
    }
    return ellipsify(summary);
}


// 수정한 코드
public String getEllipsifiedPageSummary(Path path) {
    var summary = getPageSummary(path);
    return ellipsify(summary);
}

public String getPageSumamry(Path path) {
    var resource = this.resolver.resolve(path);
    if (!resource.exists()) {
        return "";
    }
    var properties = resource.getProperties();
    return properties.get("summary");
}
```

<br>

### 33 JVM의 크래시를 유발하는 방법 (토마스 론존)
  - 여러분의 자바 가상 머신에 크래시를 유발하는 방법을 찾아보자.(아니면 최소한 정상적으로 작동하던 코드가 갑자기 의도치 않게 멈추도록 해 보자.)
  - 더 많은 방법을 찾을수록 여러분 주변의 것을 더 잘 이해하고 실행중인 소프트웨어 시스템에서 잘못될 수 있는 부분을 알아보게 될 것이다.

<br>

### 34 지속적 전달로 반복가능성과 감사가능성 향상하기 (빌리 코란도)
  - 사람은 같은 작업을 반복하는 것에 익숙하지 않다.
  - 또한 꼼꼼한 사람이더라도 누구나 실수하기 마련이다.
  - 많은 조직이 지속적 전달을 도입해 배포 실패, 코드 전달 등의 문제를 해결하기 시작했다.
  - 지속적 전달(CD, Continuous Delivery)은 코드를 프로덕션 환경에 전달하는 단계를 자동화하는 방법이다.
  - 개발자가 변경 사항을 커밋하는 시점부터 해당 변경 사항이 프로덕션 환경에 배포될 때까지의 모든 과정에 포함된 테스트, 변경 제어, 배포 처리 등은 반드시 자동화해야 한다.
  - CD를 도입하는 주된 계기는 코드를 배포하는 데 드는 시간과 노력을 줄이기 위해서다.
  - CD는 시간과 노력의 절감, 배포 절차의 반복가능성과 감사가능성이 향상되는 장점이 있다.

<br>

### 35 자바는 자바만의 강점이 있다 (제니퍼 레이프)
  - 자바는 개발자가 무엇을 어떻게 개발하고 있는지 설명해 준다.
  - 적용 범위가 넓은 기술이다.
  - 자바는 모든 스택과 영역의 기술을 다룰 수 있게 해준다.

<br>

### 36 인라인식 사고 (패트리샤 애아스)
  - 컴퓨터는 변화하는데, RAM으로부터 데이터를 읽는 상대적인 비용이 급격히 커지고 있다는 점에 중점을 둔다.

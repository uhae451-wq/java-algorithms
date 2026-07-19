# java-algorithms 기록 래퍼지토리

## 목차
- 폴더구조
- 재귀 & 백트래킹
- 완전탐색
- 자료구조
  - 스택
  - 큐
  - 해시
- 정렬 & 투 포인터
- 회고

폴더 구조
```
src/
├── recursion/          # 재귀, 백트래킹
├── search/              # 완전탐색
├── datastructure/
│   ├── stack/
│   ├── queue/
│   └── hash/
├── sorting/             # 정렬, 투 포인터
└── Main.java
```
## 재귀 & 백트래킹

| 문제 | 핵심 개념 | 링크 |
|---|---|---|
| 배열 조합 (m개 선택) | 백트래킹, start 파라미터 | [코드](src/recursion/Recursion_Q1.java) |
| 순열 만들기 | used 배열, 백트래킹 | [코드](src/recursion/Recursion_Q2.java) |
| 계단 오르기 경로 찾기 | 재귀, 가지치기 | [코드](src/recursion/Recursiont_Q3.java) |
| 예산 내 최대 방문 국가 수 | 순열, 반환값 기반 재귀 | [코드](src/recursion/Recursion_Q4.java) |

## 완전탐색

| 문제                  | 핵심 개념 | 링크 |
|---------------------|---|---|
| 배열 n개의 합 target구하기  | 브루트포스 | [코드](src/search/BruteForce_Q1.java) |
| 현재 인덱스보다 큰 인덱스값 구하기 | 브루트포스 | [코드](src/search/BruteForce_Q2.java) |
| 탐색 기초               | 완전탐색 기본기 | [코드](src/search/ExhaustiveSearch.java) |

## 재귀 & 백트래킹

| 문제 | 핵심 개념 | 링크 |
|---|---|---|
| 배열 조합 (m개 선택) | 백트래킹, start 파라미터 | [코드](src/recursion/Recursion_Q1.java) |
| 순열 만들기 | used 배열, 백트래킹 | [코드](src/recursion/Recursion_Q2.java) |
| 계단 오르기 경로 찾기 | 재귀, 가지치기 | [코드](src/recursion/Recursiont_Q3.java) |
| 예산 내 최대 방문 국가 수 | 순열, 반환값 기반 재귀 | [코드](src/recursion/Recursion_Q4.java) |

## 자료구조

### 스택

|핵심 개념 | 링크 |
|---|---|
| 스택 기본 | [코드](src/datastructure/stack/Stack01.java) |
| 스택 활용 | [코드](src/datastructure/stack/Stack_Q1.java) |
| 스택 활용 | [코드](src/datastructure/stack/Stack_Q2.java) |
| 스택 활용 | [코드](src/datastructure/stack/Stack_Q3.java) |

### 큐

| 핵심 개념 | 링크 |
|---|---|
|  큐 기본 | [코드](src/datastructure/queue/Queue01.java) |

### 해시

|  핵심 개념 | 링크 |
|---|---|
| HashMap 기본 | [코드](src/datastructure/hash/HashMap01.java) |
| HashSet 기본 | [코드](src/datastructure/hash/HashSet01.java) |
|  HashTable 활용 | [코드](src/datastructure/hash/HashTable_Q1.java) |


## 회고

### 2026.07 - 재귀함수
- `return`은 함수 호출 "하나"만 끝내는 것이지, 전체 흐름을 멈추는 게 아니라는 걸 디버깅하며 체감함
- `add` vs `addAll`: 낱개 원소를 넣을 때와 다른 리스트를 통째로 풀어서 합칠 때를 구분해서 써야 한다는 것
- 백트래킹 = "선택 → 재귀 진입 → 되돌리기"의 반복이라는 패턴을 이해함
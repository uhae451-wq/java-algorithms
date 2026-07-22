# java-algorithms 기록 래퍼지토리

## 목차
- 폴더구조
- 재귀 & 백트래킹
- 완전탐색
- 자료구조
  - 스택
  - 큐
  - 해시
- 그래프
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
├── graph
└── Main.java
```
## 재귀 & 백트래킹

| 문제 | 핵심 개념 | 링크 |
|---|---|---|
| 배열 조합 (m개 선택) | 백트래킹, start 파라미터 | [코드](src/recursion/Recursion_Q1.java) |
| 순열 만들기 | used 배열, 백트래킹 | [코드](src/recursion/Recursion_Q2.java) |
| 계단 오르기 경로 찾기 | 재귀, 가지치기 | [코드](src/recursion/Recursion_Q3.java) |
| 예산 내 최대 방문 국가 수 | 순열, 반환값 기반 재귀 | [코드](src/recursion/Recursion_Q4.java) |

## 완전탐색

| 문제                  | 핵심 개념 | 링크 |
|---------------------|---|---|
| 배열 n개의 합 target구하기  | 브루트포스 | [코드](src/search/BruteForce_Q1.java) |
| 현재 인덱스보다 큰 인덱스값 구하기 | 브루트포스 | [코드](src/search/BruteForce_Q2.java) |
| 탐색 기초               | 완전탐색 기본기 | [코드](src/search/ExhaustiveSearch.java) |

## 재귀 & 백트래킹

| 문제 | 핵심 개념 | 링크                                    |
|---|---|---------------------------------------|
| 배열 조합 (m개 선택) | 백트래킹, start 파라미터 | [코드](src/recursion/Recursion_Q1.java) |
| 순열 만들기 | used 배열, 백트래킹 | [코드](src/recursion/Recursion_Q2.java) |
| 계단 오르기 경로 찾기 | 재귀, 가지치기 | [코드](src/recursion/Recursion_Q3.java) |
| 예산 내 최대 방문 국가 수 | 순열, 반환값 기반 재귀 | [코드](src/recursion/Recursion_Q4.java) |
| 계단 오르는 조합 구하기 | 재귀, 가지치기 | [코드](src/recursion/Recursion_Q5.java) |

## 그래프

| 문제               | 핵심 개념    | 링크                                     |
|------------------|----------|----------------------------------------|
| BFS_샘플           | BFS      | [코드](src/graph/BFS_sample.java)        |
| DFS_샘플           | DFS      | [코드](src/graph/DFS_sample.java)        |
| 간선리스트를 인접리스트로 변환 | GRAPH    | [코드](src/graph/EdgeListToAdjList.java) |
| 서로 연결된 네트워크 찾기   | DFS      | [코드](src/graph/NetworkAnalyzer.java)   |
| 잠긴 락커 찾기         | DFS, BFS | [코드](src/graph/Rocker.java)            |
| 청팀 홍팀 이분그래프      | DFS, BFS | [코드](src/graph/Bipartite.java)         |

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

### 2026.07.20 - 재귀함수
- `return`은 함수 호출 "하나"만 끝내는 것이지, 전체 흐름을 멈추는 게 아니라는 걸 디버깅하며 체감함
- `add` vs `addAll`: 낱개 원소를 넣을 때와 다른 리스트를 통째로 풀어서 합칠 때를 구분해서 써야 한다는 것
- 백트래킹 = "선택 → 재귀 진입 → 되돌리기"의 반복이라는 패턴을 이해함
- 얕은 복사 문제: `result.add(selected)`가 아니라 `result.add(new ArrayList<>(selected))`로 복사본을 넣어야 나중에 값이 오염되지 않는다는 것

### 2026.07.21 - BFS , DFS 기초 / 인접리스트 만들기
- 그래프는 각 노드가 있으며, 시작점에서 가까운 노드부터 방문 하여 큐를 활용하는 BFS와 재귀를 활용하여 노드의 깊이를 파며 더이상 들어갈 노드가 없으면 돌아오는
 DFS를 배웠다.
- BFS가 시작점을 중심으로 원이 퍼지듯 탐색했다면, DFS는 미로에서 "일단 이 길로 갈 수 있는 데까지 가보고, 막히면 갈림길로 돌아온다"는 느낌에 가깝다.
- 입력값으로 간선리스트가 주어졌을때, 활용하기 좋은 인접 리스트로 변환하는 것이 좋다.

### 2026.07.22 - BFS , DFS 이분그래프
- 처음에는 DFS/BFS로 팀을 어떻게 나눠야 하는지 감이 오지 않았지만, 현재 정점의 반대 팀을 친구에게 배정하는 원리를 이해하면서 해결할 수 있었다.
- DFS를 구현한 뒤 같은 로직을 BFS에도 적용해 보면서 두 탐색 방식은 다르지만 핵심 로직은 동일하다는 점을 배웠다.

# Professional Experience & Qualifications

---

## EXECUTIVE SUMMARY

Senior/Principal Member of Technical Staff with 10+ years of software development experience, specializing in large-scale data processing systems, distributed architecture, and production operational excellence. Demonstrated expertise architecting and operating PB+-scale data platforms at Model N using Apache Spark, Delta Lake, Kafka, and cloud-native technologies. Track record of delivering mission-critical systems serving 1000s of concurrent users across enterprise SaaS products.

---


## TECHNICAL EXPERTISE & ACHIEVEMENTS

### Big Data & Data Processing Systems

**Datahub Platform** — Multi-Tenant Data Lakehouse
- Architected & operated production system: Spark 3.5.6, EMR 7.12.0, Delta Lake 3.3.2, Hadoop 3.4.1
- Ingestion, transformation, and serving of data for 100s of enterprise customers
- Implemented metadata-driven pipeline framework supporting incremental SQL transformations
- Key achievement: **Zero-downtime deployment strategy** — decoupled DH Service, Kubernetes, and Processing Engine upgrades, enabling monthly feature releases without maintenance windows
- Designed comprehensive observability: Prometheus metrics, Grafana dashboards, proactive alerting

**DNA (Data & Analytics) Platform** — Continuous Data Replication & ETL at Scale
- Led architecture of Source-to-Raw (S2R) CDC pipelines: Oracle binary change logs → Delta Lake tables via Spark Structured Streaming
- Implemented Raw-to-Canonical (R2C) transformations: YAML-driven pipeline definitions + generic metadata-driven Spark executor
- Continuous replication of terabytes of transactional data with <1hr SLA
- Integrated with Orchestration Service (OS), Datahub, TCM, UAM for end-to-end platform ecosystem

### Scale & Production Excellence

**Multi-Tenant Architecture at Scale:**
- Per-tenant S3 buckets; per-tenant YARN capacity queues; per-tenant Dremio query spaces
- Millions of events/day ingestion; sub-second to minute-level query latency
- 100s of concurrent users per tenant; 1000s+ total users across all platforms
- 99.9%+ availability SLAs

**Reliability & Operational Excellence:**
- **Backup/Reconciliation:** Cross-component strategy covering S3, Oracle, EFS, Hive, DynamoDB, AWS Secrets Manager; automated inconsistency detection & remediation
- **Disaster Recovery:** AWS CRR/MRAP multi-region design with end-to-end restore sequencing; published runbooks enabling rapid recovery
- **Monitoring & Observability:** Prometheus metrics (job times, queue depth, data freshness, connector lag); high-cardinality tracking (long-running queries, connection pool exhaustion, shuffle spill); actionable alerting semantics

### Security & Governance

- **Authentication & Authorization:** Integrated Keycloak + Model N UAM across Datahub, DNA, Industry Network; OIDC/JWT-based secure API access
- **Multi-Tenant Isolation:** Strict segregation at storage (S3), compute (YARN), and query layers (Dremio); prevented cross-tenant data leakage
- **Data Governance:** Metadata-driven access controls and audit trails for Life Sciences and High Tech regulatory compliance
- **Security Hardening:** Leading initiative to remove open access to DH Service API; driving zero-trust network architecture

---

## CROSS-FUNCTIONAL LEADERSHIP & COLLABORATION

**Spanning Technical Domains:**

1. **High Tech Revenue Management Cloud** — Microservices migration at scale
   - Collaborated with product, commerce, supply chain teams
   - Decomposed Order-to-Cash workflows (opportunities, quotes, contracts, rebates, inventory) into independently deployable services
   - Shipped via TDD and Agile practices

2. **Sales Conductor / Revvy Sales** — Enterprise SaaS integration
   - Designed **Force Multiplier** integration framework: bidirectional object mappings, field translations, extensibility hooks
   - Led technical coordination across Salesforce architects, Model N engineers, go-to-market teams
   - Zero manual intervention data sync

3. **Industry Network Portal** — Partner ecosystem
   - Built React UI + Node.js AWS Lambda backend with Keycloak SSO integration
   - Partnered with business teams to scope workflows; translated to secure multi-tenant APIs

4. **Data Platforms** (Datahub, DNA, UAM) — Platform engineering
   - Collaborated with analytics, security, governance, product teams
   - Defined metadata schemas, pipeline semantics, sharing protocols balancing developer velocity with enterprise governance

**Leadership & Mentorship (Principal-Level):**
- Set technical direction for multi-team initiatives; design reviews ensuring production-readiness standards
- Authored comprehensive design documents enabling independent team operation
- Published operational runbooks and integration guides for customer/partner self-service
- Mentored junior engineers through design decomposition, production debugging, architectural trade-offs

---

## TECHNICAL STACK MASTERY

**Core Technologies:**
- Apache Spark (3.5.6), Structured Streaming, DataFrame/SQL APIs
- Delta Lake (ACID, schema evolution, time travel, partitioning, streaming)
- AWS EMR, S3, Glue Catalog, RDS/Oracle, DynamoDB, Secrets Manager, Lambda
- Kafka (event streaming, CDC patterns)
- Dremio (analytical query engine)
- Kubernetes, Helm, GitOps CI/CD
- Spring Boot, Java, Scala
- Prometheus, Grafana, alerting systems

**Key Capabilities:**
- Metadata-driven data transformation frameworks
- Change Data Capture (CDC) & incremental data replication
- Schema evolution & data consistency at scale
- Multi-tenant SaaS platform architecture
- Real-time & batch ETL pipelines
- Observability architecture (metrics, tracing, alerting)
- Disaster recovery & business continuity
- OAuth2/OIDC, zero-trust security patterns

---

## IMPACT & RESULTS

- **10+ years** of proven software development and technical leadership
- **PB+-scale** data platforms architected and operated
- **99.9%+ availability SLAs** maintained across all production systems
- **<5 minute MTTR** for critical data pipeline failures via comprehensive observability
- **Zero-downtime deployment** strategy eliminating scheduled maintenance windows
- **100% operational data** protected via backup/DR strategies
- **1000s+ concurrent users** across multiple enterprise SaaS products
- **Cross-functional impact** spanning 6 major product lines and 10+ technical domains

---

## PERSONAL ATTRIBUTES ALIGNMENT

✓ **Intellectual Curiosity** — Continuously explored new technologies (Delta Lake, Spark Streaming, Lambda-based architectures); stayed ahead of platform evolution

✓ **Bias Toward Action** — Shipped zero-downtime deployment strategy, comprehensive observability, disaster recovery runbooks—not just designed, but executed and operationalized

✓ **Innovation + Operational Discipline** — Balanced cutting-edge big data technologies with production reliability (99.9%+ SLAs, <5 min MTTR)

✓ **Collaborative Mindset** — Worked seamlessly across product, security, analytics, infrastructure, go-to-market teams; authored knowledge-transfer documentation

✓ **Mentorship & Team Success** — Guided junior engineers through complex technical problems; established design review standards; published enablement frameworks

---

## CONCLUSION

I bring a proven track record of designing, architecting, and operating production-grade data systems at enterprise scale. My expertise spans the full spectrum of your requirements: hands-on mastery of Apache Spark, Delta Lake, Kafka, and cloud-native technologies; deep understanding of distributed system design and operational excellence; and demonstrated ability to drive cross-functional collaboration and technical leadership. I am excited to bring this experience to your organization and contribute to platforms operating at global scale.

---

**Senior Member of Technical Staff / Principal Member of Technical Staff**  
*Data Processing & Big Data Systems Architecture*

